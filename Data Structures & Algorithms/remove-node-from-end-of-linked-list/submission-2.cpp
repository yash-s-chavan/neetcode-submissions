/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* cur = head;
        ListNode* answer = head;
        if(head->next == nullptr){
            return head->next;
        }
        for(int i = 0;i<n;i++){
            head = head->next;
        }
        if(head == nullptr){
            return cur->next;
        }
        while(head->next!=nullptr){
            cur = cur->next;
            head = head->next;
        }
        cur->next = cur->next->next;
        return answer;
    }
};
