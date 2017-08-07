package com.reodont.telegram.model;

public class WrappedMessage {
    private final String topic;
    private final Message msg;

    public WrappedMessage(Update update) {
        if (update.message() != null) {
            this.topic = "message";
            this.msg = update.message();
        } else if (update.channelPost() != null) {
            this.topic = "channelPost";
            this.msg = update.channelPost();
        } else if (update.editedMessage() != null) {
            this.topic = "editedMessage";
            this.msg = update.editedMessage();
        } else if (update.editedChannelPost() != null) {
            this.topic = "editedChannelPost";
            this.msg = update.editedChannelPost();
        } else {
            this.topic = "null";
            this.msg = null;
        }
    }

    public Message getMsg() {
        return msg;
    }

    public String getTopic() {
        return topic;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WrappedMessage)) return false;

        WrappedMessage that = (WrappedMessage) o;

        if (topic != null ? !topic.equals(that.topic) : that.topic != null) return false;
        return msg != null ? msg.equals(that.msg) : that.msg == null;
    }

    @Override
    public int hashCode() {
        int result = topic != null ? topic.hashCode() : 0;
        result = 31 * result + (msg != null ? msg.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "WrappedMessage{" +
                "topic='" + topic + '\'' +
                ", msg=" + msg +
                '}';
    }
}
