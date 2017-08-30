/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model.object;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ChatMember implements Serializable {

    private static final long serialVersionUID = 1541828537792400941L;

    public enum Status {
        creator, administrator, member, restricted, left, kicked
    }

    private User user;

    private Status status;

    @SerializedName("until_date")
    private Integer untilDate;

    @SerializedName("can_be_edited")
    private Boolean canBeEdited;

    @SerializedName("can_change_info")
    private Boolean canChangeInfo;

    @SerializedName("can_post_messages")
    private Boolean canPostMessages;

    @SerializedName("can_edit_messages")
    private Boolean canEditMessages;

    @SerializedName("can_delete_messages")
    private Boolean canDeleteMessages;

    @SerializedName("can_invite_users")
    private Boolean canInviteUsers;

    @SerializedName("can_restrict_members")
    private Boolean canRestrictMembers;

    @SerializedName("can_pin_messages")
    private Boolean canPinMessages;

    @SerializedName("can_promote_members")
    private Boolean canPromoteMembers;

    @SerializedName("can_send_messages")
    private Boolean canSendMessages;

    @SerializedName("can_send_media_messages")
    private Boolean canSendMediaMessages;

    @SerializedName("can_send_other_messages")
    private Boolean canSendOtherMessages;

    @SerializedName("can_add_web_page_previews")
    private Boolean canAddWebPagePreviews;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public User getUser() {
        return user;
    }

    public Status getStatus() {
        return status;
    }

    public Integer getUntilDate() {
        return untilDate;
    }

    public Boolean getCanBeEdited() {
        return canBeEdited;
    }

    public Boolean getCanChangeInfo() {
        return canChangeInfo;
    }

    public Boolean getCanPostMessages() {
        return canPostMessages;
    }

    public Boolean getCanEditMessages() {
        return canEditMessages;
    }

    public Boolean getCanDeleteMessages() {
        return canDeleteMessages;
    }

    public Boolean getCanInviteUsers() {
        return canInviteUsers;
    }

    public Boolean getCanRestrictMembers() {
        return canRestrictMembers;
    }

    public Boolean getCanPinMessages() {
        return canPinMessages;
    }

    public Boolean getCanPromoteMembers() {
        return canPromoteMembers;
    }

    public Boolean getCanSendMessages() {
        return canSendMessages;
    }

    public Boolean getCanSendMediaMessages() {
        return canSendMediaMessages;
    }

    public Boolean getCanSendOtherMessages() {
        return canSendOtherMessages;
    }

    public Boolean getCanAddWebPagePreviews() {
        return canAddWebPagePreviews;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChatMember that = (ChatMember) o;

        if (user != null ? !user.equals(that.user) : that.user != null) return false;
        if (status != that.status) return false;
        if (untilDate != null ? !untilDate.equals(that.untilDate) : that.untilDate != null) return false;
        if (canBeEdited != null ? !canBeEdited.equals(that.canBeEdited) : that.canBeEdited != null) return false;
        if (canChangeInfo != null ? !canChangeInfo.equals(that.canChangeInfo) : that.canChangeInfo != null)
            return false;
        if (canPostMessages != null ? !canPostMessages.equals(that.canPostMessages) : that.canPostMessages != null)
            return false;
        if (canEditMessages != null ? !canEditMessages.equals(that.canEditMessages) : that.canEditMessages != null)
            return false;
        if (canDeleteMessages != null ? !canDeleteMessages.equals(that.canDeleteMessages) : that.canDeleteMessages != null)
            return false;
        if (canInviteUsers != null ? !canInviteUsers.equals(that.canInviteUsers) : that.canInviteUsers != null)
            return false;
        if (canRestrictMembers != null ? !canRestrictMembers.equals(that.canRestrictMembers) : that.canRestrictMembers != null)
            return false;
        if (canPinMessages != null ? !canPinMessages.equals(that.canPinMessages) : that.canPinMessages != null)
            return false;
        if (canPromoteMembers != null ? !canPromoteMembers.equals(that.canPromoteMembers) : that.canPromoteMembers != null)
            return false;
        if (canSendMessages != null ? !canSendMessages.equals(that.canSendMessages) : that.canSendMessages != null)
            return false;
        if (canSendMediaMessages != null ? !canSendMediaMessages.equals(that.canSendMediaMessages) : that.canSendMediaMessages != null)
            return false;
        if (canSendOtherMessages != null ? !canSendOtherMessages.equals(that.canSendOtherMessages) : that.canSendOtherMessages != null)
            return false;
        return canAddWebPagePreviews != null ? canAddWebPagePreviews.equals(that.canAddWebPagePreviews) : that.canAddWebPagePreviews == null;
    }

    @Override
    public int hashCode() {
        int result = user != null ? user.hashCode() : 0;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (untilDate != null ? untilDate.hashCode() : 0);
        result = 31 * result + (canBeEdited != null ? canBeEdited.hashCode() : 0);
        result = 31 * result + (canChangeInfo != null ? canChangeInfo.hashCode() : 0);
        result = 31 * result + (canPostMessages != null ? canPostMessages.hashCode() : 0);
        result = 31 * result + (canEditMessages != null ? canEditMessages.hashCode() : 0);
        result = 31 * result + (canDeleteMessages != null ? canDeleteMessages.hashCode() : 0);
        result = 31 * result + (canInviteUsers != null ? canInviteUsers.hashCode() : 0);
        result = 31 * result + (canRestrictMembers != null ? canRestrictMembers.hashCode() : 0);
        result = 31 * result + (canPinMessages != null ? canPinMessages.hashCode() : 0);
        result = 31 * result + (canPromoteMembers != null ? canPromoteMembers.hashCode() : 0);
        result = 31 * result + (canSendMessages != null ? canSendMessages.hashCode() : 0);
        result = 31 * result + (canSendMediaMessages != null ? canSendMediaMessages.hashCode() : 0);
        result = 31 * result + (canSendOtherMessages != null ? canSendOtherMessages.hashCode() : 0);
        result = 31 * result + (canAddWebPagePreviews != null ? canAddWebPagePreviews.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ChatMember{" +
                "user=" + user +
                ", status=" + status +
                ", untilDate=" + untilDate +
                ", canBeEdited=" + canBeEdited +
                ", canChangeInfo=" + canChangeInfo +
                ", canPostMessages=" + canPostMessages +
                ", canEditMessages=" + canEditMessages +
                ", canDeleteMessages=" + canDeleteMessages +
                ", canInviteUsers=" + canInviteUsers +
                ", canRestrictMembers=" + canRestrictMembers +
                ", canPinMessages=" + canPinMessages +
                ", canPromoteMembers=" + canPromoteMembers +
                ", canSendMessages=" + canSendMessages +
                ", canSendMediaMessages=" + canSendMediaMessages +
                ", canSendOtherMessages=" + canSendOtherMessages +
                ", canAddWebPagePreviews=" + canAddWebPagePreviews +
                '}';
    }
}
