package com.mindlinksoft.recruitment.mychat;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * Represents the model of a conversation.
 */
public final class Conversation {
    /**
     * The name of the conversation.
     */
    public String name;

    /**
     * The messages in the conversation.
     */
    public Collection<Message> messages;


    /*
     * Names and # of messages sent by participants in conversation
     */
    public Map<String, Integer> participants;

    /**
     * Initializes a new instance of the {@link Conversation} class.
     * @param name The name of the conversation.
     * @param messages The messages in the conversation.
     */
    public Conversation(String name, Collection<Message> messages, Map<String, Integer> participants) {
        this.name = name;
        this.messages = messages;
        this.participants = participants;
    }

    /*
     * Returns only the messages which are sent by specified user
     * @param name The name of the user
     */
    public Collection<Message> FilteredByUser(String name)
    {
        // TODO: Implement this
        return this.messages;
    }

    /*
     * Returns only the messages which contain specified keyword
     * @param keyword The keyword to be included
     */
    public Collection<Message> FilteredByKeyword(String keyword)
    {
        // TODO: Implement this
        return this.messages;
    }

    /*
     * Returns the messages with blacklisted words redacted
     * @param blacklist The blacklist of words to be redacted
     */
    public Collection<Message> Redacted(List<String> blacklist)
    {
        // TODO: Implement this
        return this.messages;
    }
}
