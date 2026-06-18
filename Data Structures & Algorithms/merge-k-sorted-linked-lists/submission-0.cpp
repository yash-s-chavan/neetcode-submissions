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
    ListNode* mergeKLists(vector<ListNode*>& lists) {
        if(lists.size() == 0){
            return nullptr;
        }
        ListNode* master = lists[0];
        for(int i = 1;i<lists.size();i++){
            ListNode* final = master;
            
            ListNode* answer = new ListNode();
            ListNode* holder = answer;
            ListNode* current = lists[i];
            while(final != nullptr && current != nullptr){
                if(final->val<current->val){
                    answer->next = new ListNode(final->val);
                    final = final->next;
                    answer = answer->next;
                }
                else{
                    answer->next = new ListNode(current->val);
                    current = current->next;
                    answer = answer->next;
                }
            }
            while(final!=nullptr){
                answer->next = new ListNode(final->val);
                final = final->next;
                answer = answer->next;
            }
            while(current!=nullptr){
                answer->next = new ListNode(current->val);
                answer = answer->next;
                current = current->next;
            }
            
            
            master = holder->next;

        }
        return master;
        
    }
};
