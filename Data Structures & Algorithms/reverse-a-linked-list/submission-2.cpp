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
    ListNode* reverseList(ListNode* head) {
        ListNode* current = head;
        if(head == nullptr || head->next == nullptr){
            return head;
        }
        head = head->next;
        current->next = nullptr;

        while(head->next != nullptr){
            ListNode* temp = head->next;
            head->next = current;
            current = head;
            head = temp;
        }

        head->next = current;
        return head;
    }
};
