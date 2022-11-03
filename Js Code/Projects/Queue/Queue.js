class Node {
    constructor(data) {
      this.data = data
      this.next = null
    }
  }
  
  class QueueAsLinkedList {
    constructor(head = null){
      this.head = head
      this.lastNode = this.head
    }
  
    bottom() {
      return this.head
    }
  
    push(newNode) {
      if (!this.head){
        this.head = newNode
        this.head.next = null
      }
      else {
        this.lastNode.next = newNode
        this.lastNode = this.lastNode.next
      }
    }
  
    popleft() {
      if (!this.head) {
        alert("Can not pop from an empty queue")
      } else {
         this.head = this.head.next
      }
    }  
  }
  
  
  
  Queue = new QueueAsLinkedList(new Node(5))
  Queue.push(new Node(3))
  Queue.push(new Node(7))
  Queue.push(new Node(8))
  Queue.push(new Node(2))
  Queue.popleft()
  console.log(Queue.bottom())