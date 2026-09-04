/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    HashMap<Node, Node> _map = new HashMap<>();

    public Node copyRandomList(Node head) {
        if(head == null) return null;
        if(_map.containsKey(head)) return _map.get(head);
        Node newHead = new Node(head.val);
        _map.put(head, newHead);
        newHead.next = copyRandomList(head.next);
        newHead.random = _map.get(head.random);
        return newHead;
    }
}
