package com.reodont.telegram.model;

import java.io.Serializable;
import java.util.Arrays;

public class Message implements Serializable {

    private static final long serialVersionUID = 1067397950481020177L;

    private Integer messageId;

    private User from;

    private Integer date;

    private Chat chat;

    private User forwardFrom;

    private Chat forwardFromChat;

    private Integer forwardFromMessageId;

    private Integer forwardDate;

    private Message replyToMessage;

    private Integer editDate;

    private String text;

    private MessageEntity[] entities;

    private Audio audio;

    private Document document;

    private Game game;

    private PhotoSize[] photo;

    private Sticker sticker;

    private Video video;

    private Voice voice;

    private VideoNote videoNote;

    private User[] newChatMembers;

    private String caption;

    private Contact contact;

    private Location location;

    private Venue venue;

    private User newChatMember;

    private User leftChatMember;

    private String newChatTitle;

    private PhotoSize[] newChatPhoto;

    private Boolean deleteChatPhoto;

    private Boolean groupChatCreated;

    private Boolean supergroupChatCreated;

    private Boolean channelChatCreated;

    private Long migrateToChatId;

    private Long migrateFromChatId;

    private Message pinnedMessage;

    private Invoice invoice;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public User getFrom() {
        return from;
    }

    public Integer getDate() {
        return date;
    }

    public Chat getChat() {
        return chat;
    }

    public User getForwardFrom() {
        return forwardFrom;
    }

    public Chat getForwardFromChat() {
        return forwardFromChat;
    }

    public Integer getForwardFromMessageId() {
        return forwardFromMessageId;
    }

    public Integer getForwardDate() {
        return forwardDate;
    }

    public Message getReplyToMessage() {
        return replyToMessage;
    }

    public Integer getEditDate() {
        return editDate;
    }

    public String getText() {
        return text;
    }

    public MessageEntity[] getEntities() {
        return entities;
    }

    public Audio getAudio() {
        return audio;
    }

    public Document getDocument() {
        return document;
    }

    public Game getGame() {
        return game;
    }

    public PhotoSize[] getPhoto() {
        return photo;
    }

    public Sticker getSticker() {
        return sticker;
    }

    public Video getVideo() {
        return video;
    }

    public Voice getVoice() {
        return voice;
    }

    public VideoNote getVideoNote() {
        return videoNote;
    }

    public User[] getNewChatMembers() {
        return newChatMembers;
    }

    public String getCaption() {
        return caption;
    }

    public Contact getContact() {
        return contact;
    }

    public Location getLocation() {
        return location;
    }

    public Venue getVenue() {
        return venue;
    }

    public User getNewChatMember() {
        return newChatMember;
    }

    public User getLeftChatMember() {
        return leftChatMember;
    }

    public String getNewChatTitle() {
        return newChatTitle;
    }

    public PhotoSize[] getNewChatPhoto() {
        return newChatPhoto;
    }

    public Boolean getDeleteChatPhoto() {
        return deleteChatPhoto;
    }

    public Boolean getGroupChatCreated() {
        return groupChatCreated;
    }

    public Boolean getSupergroupChatCreated() {
        return supergroupChatCreated;
    }

    public Boolean getChannelChatCreated() {
        return channelChatCreated;
    }

    public Long getMigrateToChatId() {
        return migrateToChatId;
    }

    public Long getMigrateFromChatId() {
        return migrateFromChatId;
    }

    public Message getPinnedMessage() {
        return pinnedMessage;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message = (Message) o;

        if (messageId != null ? !messageId.equals(message.messageId) : message.messageId != null) return false;
        if (from != null ? !from.equals(message.from) : message.from != null) return false;
        if (date != null ? !date.equals(message.date) : message.date != null) return false;
        if (chat != null ? !chat.equals(message.chat) : message.chat != null) return false;
        if (forwardFrom != null ? !forwardFrom.equals(message.forwardFrom) : message.forwardFrom != null) return false;
        if (forwardFromChat != null ? !forwardFromChat.equals(message.forwardFromChat) : message.forwardFromChat != null)
            return false;
        if (forwardFromMessageId != null ? !forwardFromMessageId.equals(message.forwardFromMessageId) : message.forwardFromMessageId != null)
            return false;
        if (forwardDate != null ? !forwardDate.equals(message.forwardDate) : message.forwardDate != null) return false;
        if (replyToMessage != null ? !replyToMessage.equals(message.replyToMessage) : message.replyToMessage != null)
            return false;
        if (editDate != null ? !editDate.equals(message.editDate) : message.editDate != null) return false;
        if (text != null ? !text.equals(message.text) : message.text != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(entities, message.entities)) return false;
        if (audio != null ? !audio.equals(message.audio) : message.audio != null) return false;
        if (document != null ? !document.equals(message.document) : message.document != null) return false;
        if (game != null ? !game.equals(message.game) : message.game != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(photo, message.photo)) return false;
        if (sticker != null ? !sticker.equals(message.sticker) : message.sticker != null) return false;
        if (video != null ? !video.equals(message.video) : message.video != null) return false;
        if (voice != null ? !voice.equals(message.voice) : message.voice != null) return false;
        if (videoNote != null ? !videoNote.equals(message.videoNote) : message.videoNote != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(newChatMembers, message.newChatMembers)) return false;
        if (caption != null ? !caption.equals(message.caption) : message.caption != null) return false;
        if (contact != null ? !contact.equals(message.contact) : message.contact != null) return false;
        if (location != null ? !location.equals(message.location) : message.location != null) return false;
        if (venue != null ? !venue.equals(message.venue) : message.venue != null) return false;
        if (newChatMember != null ? !newChatMember.equals(message.newChatMember) : message.newChatMember != null)
            return false;
        if (leftChatMember != null ? !leftChatMember.equals(message.leftChatMember) : message.leftChatMember != null)
            return false;
        if (newChatTitle != null ? !newChatTitle.equals(message.newChatTitle) : message.newChatTitle != null)
            return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(newChatPhoto, message.newChatPhoto)) return false;
        if (deleteChatPhoto != null ? !deleteChatPhoto.equals(message.deleteChatPhoto) : message.deleteChatPhoto != null)
            return false;
        if (groupChatCreated != null ? !groupChatCreated.equals(message.groupChatCreated) : message.groupChatCreated != null)
            return false;
        if (supergroupChatCreated != null ? !supergroupChatCreated.equals(message.supergroupChatCreated) : message.supergroupChatCreated != null)
            return false;
        if (channelChatCreated != null ? !channelChatCreated.equals(message.channelChatCreated) : message.channelChatCreated != null)
            return false;
        if (migrateToChatId != null ? !migrateToChatId.equals(message.migrateToChatId) : message.migrateToChatId != null)
            return false;
        if (migrateFromChatId != null ? !migrateFromChatId.equals(message.migrateFromChatId) : message.migrateFromChatId != null)
            return false;
        if (pinnedMessage != null ? !pinnedMessage.equals(message.pinnedMessage) : message.pinnedMessage != null)
            return false;
        return invoice != null ? invoice.equals(message.invoice) : message.invoice == null;
    }

    @Override
    public int hashCode() {
        int result = messageId != null ? messageId.hashCode() : 0;
        result = 31 * result + (from != null ? from.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (chat != null ? chat.hashCode() : 0);
        result = 31 * result + (forwardFrom != null ? forwardFrom.hashCode() : 0);
        result = 31 * result + (forwardFromChat != null ? forwardFromChat.hashCode() : 0);
        result = 31 * result + (forwardFromMessageId != null ? forwardFromMessageId.hashCode() : 0);
        result = 31 * result + (forwardDate != null ? forwardDate.hashCode() : 0);
        result = 31 * result + (replyToMessage != null ? replyToMessage.hashCode() : 0);
        result = 31 * result + (editDate != null ? editDate.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(entities);
        result = 31 * result + (audio != null ? audio.hashCode() : 0);
        result = 31 * result + (document != null ? document.hashCode() : 0);
        result = 31 * result + (game != null ? game.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(photo);
        result = 31 * result + (sticker != null ? sticker.hashCode() : 0);
        result = 31 * result + (video != null ? video.hashCode() : 0);
        result = 31 * result + (voice != null ? voice.hashCode() : 0);
        result = 31 * result + (videoNote != null ? videoNote.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(newChatMembers);
        result = 31 * result + (caption != null ? caption.hashCode() : 0);
        result = 31 * result + (contact != null ? contact.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (venue != null ? venue.hashCode() : 0);
        result = 31 * result + (newChatMember != null ? newChatMember.hashCode() : 0);
        result = 31 * result + (leftChatMember != null ? leftChatMember.hashCode() : 0);
        result = 31 * result + (newChatTitle != null ? newChatTitle.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(newChatPhoto);
        result = 31 * result + (deleteChatPhoto != null ? deleteChatPhoto.hashCode() : 0);
        result = 31 * result + (groupChatCreated != null ? groupChatCreated.hashCode() : 0);
        result = 31 * result + (supergroupChatCreated != null ? supergroupChatCreated.hashCode() : 0);
        result = 31 * result + (channelChatCreated != null ? channelChatCreated.hashCode() : 0);
        result = 31 * result + (migrateToChatId != null ? migrateToChatId.hashCode() : 0);
        result = 31 * result + (migrateFromChatId != null ? migrateFromChatId.hashCode() : 0);
        result = 31 * result + (pinnedMessage != null ? pinnedMessage.hashCode() : 0);
        result = 31 * result + (invoice != null ? invoice.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageId=" + messageId +
                ", from=" + from +
                ", date=" + date +
                ", chat=" + chat +
                ", forwardFrom=" + forwardFrom +
                ", forwardFromChat=" + forwardFromChat +
                ", forwardFromMessageId=" + forwardFromMessageId +
                ", forwardDate=" + forwardDate +
                ", replyToMessage=" + replyToMessage +
                ", editDate=" + editDate +
                ", text='" + text + '\'' +
                ", entities=" + Arrays.toString(entities) +
                ", audio=" + audio +
                ", document=" + document +
                ", game=" + game +
                ", photo=" + Arrays.toString(photo) +
                ", sticker=" + sticker +
                ", video=" + video +
                ", voice=" + voice +
                ", videoNote=" + videoNote +
                ", newChatMembers=" + Arrays.toString(newChatMembers) +
                ", caption='" + caption + '\'' +
                ", contact=" + contact +
                ", location=" + location +
                ", venue=" + venue +
                ", newChatMember=" + newChatMember +
                ", leftChatMember=" + leftChatMember +
                ", newChatTitle='" + newChatTitle + '\'' +
                ", newChatPhoto=" + Arrays.toString(newChatPhoto) +
                ", deleteChatPhoto=" + deleteChatPhoto +
                ", groupChatCreated=" + groupChatCreated +
                ", supergroupChatCreated=" + supergroupChatCreated +
                ", channelChatCreated=" + channelChatCreated +
                ", migrateToChatId=" + migrateToChatId +
                ", migrateFromChatId=" + migrateFromChatId +
                ", pinnedMessage=" + pinnedMessage +
                ", invoice=" + invoice +
                '}';
    }
}
