package com.fanleagueent.fanleague.data.net.deserializers;

import com.fanleagueent.fanleague.data.entity.BaseResponse;
import com.fanleagueent.fanleague.data.entity.entities.user.ResetLinkErrorEntity;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

/**
 * Created by alexeyverbitskiy on 10/24/16.
 */

public class ResetPasswordDeserializer implements JsonDeserializer<BaseResponse> {
    @Override
    public BaseResponse deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context)
            throws JsonParseException {
        final BaseResponse resetPasswordResponse = new BaseResponse();
        final JsonObject jsonObject = json.getAsJsonObject();
        if (jsonObject.get("message") != null)
            resetPasswordResponse.setMessage(jsonObject.get("message").getAsString());

        if (jsonObject.get("error") != null)
            resetPasswordResponse.setError(jsonObject.get("error").getAsBoolean());

        if (jsonObject.get("errors") != null)
            resetPasswordResponse.setMessage(new Gson().fromJson(jsonObject.get("errors").getAsJsonObject(), ResetLinkErrorEntity.class).getMessageEmail());

        return resetPasswordResponse;
    }

}
