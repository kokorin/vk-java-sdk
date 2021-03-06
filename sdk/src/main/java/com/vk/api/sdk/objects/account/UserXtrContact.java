package com.vk.api.sdk.objects.account;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.users.UserFull;

import java.util.Objects;

/**
 * UserXtrContact object
 */
public class UserXtrContact extends UserFull {

    @SerializedName("contact")
    private String contact;

    @SerializedName("request_sent")
    private Integer requestSent;

    @SerializedName("sort_num")
    private Integer sortNum;

    public String getContact() {
        return contact;
    }

    public Integer getRequestSent() {
        return requestSent;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), contact, sortNum, requestSent);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        UserXtrContact userXtrContact = (UserXtrContact) o;
        return Objects.equals(contact, userXtrContact.contact) &&
                Objects.equals(requestSent, userXtrContact.requestSent) &&
                Objects.equals(sortNum, userXtrContact.sortNum);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserXtrContact{");
        sb.append("contact='").append(contact).append("'");
        sb.append(", requestSent=").append(requestSent);
        sb.append(", sortNum=").append(sortNum);
        sb.append('}');
        return sb.toString();
    }
}
