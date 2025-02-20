
public class stack_using_Q_push_eff {

	private queue q_Primary;
	private queue q_Helper;

	public static final int DEFAULT_CAPACITY = 10;

	public stack_using_Q_push_eff() {
		this(DEFAULT_CAPACITY);
	}

	public stack_using_Q_push_eff(int cap) {
		this.q_Primary = new queue(cap);
		this.q_Helper = new queue(cap);
	}

	public int size() {
		return this.q_Primary.size();
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void push(int item) throws Exception {
		try {
			this.q_Primary.enqueue(item);
		} catch (Exception ex) {
			throw new Exception("stack is full");
		}
	}

	public int top() throws Exception {
		// if (this.isEmpty()) {
		// throw new Exception("stack is empty");
		// }
		try {
			while (this.q_Primary.size() != 1) {
				this.q_Helper.enqueue(this.q_Primary.dequeue());
			}
			int rv = this.q_Primary.dequeue();
			this.q_Helper.enqueue(rv);
			queue temp = this.q_Primary;
			this.q_Primary = this.q_Helper;
			this.q_Helper = temp;
			return rv;
		} catch (Exception ex) {
			throw new Exception("stack is empty");
		}
	}

	public int pop() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("stack is empty");
		}
		while (this.q_Primary.size() != 1) {
			this.q_Helper.enqueue(this.q_Primary.dequeue());
		}
		int rv = this.q_Primary.dequeue();
		queue temp = this.q_Primary;
		this.q_Primary = this.q_Helper;
		this.q_Helper = temp;
		return rv;
	}

	public String toString() {
		String rv = "";
		try {
			rv = this.toReverseString() + "end";

			queue temp = this.q_Primary;
			this.q_Primary = this.q_Helper;
			this.q_Helper = temp;
		} catch (Exception ex) {
		}
		return rv;
	}

	public String toReverseString() throws Exception {
		if (this.q_Primary.size() == 0) {
			return "";
		}

		int item = this.q_Primary.dequeue();
		this.q_Helper.enqueue(item);

		String rv = this.toReverseString();
		rv += item + " => ";
		return rv;
	}

}
