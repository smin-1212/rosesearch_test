package org.fastcatsearch.http.action.service.dictionary;

import org.fastcatsearch.http.ActionMapping;
import org.fastcatsearch.http.ActionMethod;
import org.fastcatsearch.http.action.ActionRequest;
import org.fastcatsearch.http.action.ActionResponse;
import org.fastcatsearch.http.action.ServiceAction;
import org.fastcatsearch.http.action.management.dictionary.UpdateDictionaryWordAction;

/**
 * Created by 전제현 on 2017. 5. 25.
 */
@ActionMapping(value="/service/dictionary/update", method = { ActionMethod.POST })
public class UpdateDictionaryWordServiceAction extends ServiceAction {

    @Override
    public void doAction(ActionRequest request, ActionResponse response) throws Exception {

        UpdateDictionaryWordAction action = new UpdateDictionaryWordAction();
        action.init(this.resultType, request, response, null);
        writeHeader(response);
        action.doAuthAction(request, response);
    }
}
