/*
 * AbstractTaskFilter.java
 *
 * Created on 05 August 2005, 23:10
 */

package org.cesilko.rachota.core.filters;

import java.util.Vector;


/** Abstract task filter forwarding all provided tasks.
 * Can't be instantiated because of its empty implementation.
 * @author Jiri Kovalsky
 */
public abstract class AbstractTaskFilter {
    
    /** One of content rules determining allowed content. */
    private int contentRule;
    /** Content that must comply with content rule. */
    private String content;
    
    /**
     * Default filter constructor.
     * @param contentRule One of content rules determining allowed content.
     * @param content Required content that must comply with content rule.
     */
    public AbstractTaskFilter(int contentRule, String content) {
        setContentRule(contentRule);
        setContent(content);
    }
    
    /** Sets content rule of filter.
     * @param contentRule New content rule.
     */
    public void setContentRule(int contentRule) {
        this.contentRule = contentRule;
    }
    
    /** Sets required content of appropriate task property.
     * @param content New required content of appropriate task property.
     */
    public void setContent(String content) {
        this.content = content;
    }
    
    /** Returns content rule of filter.
     * @return Content rule of filter.
     */
    public int getContentRule() {
        return contentRule;
    }
    
    /** Returns all available content rules of filter.
     * @return All content rules of filter.
     */
    public Vector getContentRules() {
        return null;
    }
    
    /** Returns required content of appropriate task property.
     * @return Required content of appropriate task property.
     */
    public String getContent() {
        return content;
    }
    
    /** Returns all available content values of filter.
     * @return All content values of filter.
     */
    public Vector getContentValues() {
        return null;
    }
    
    /** Applies filter on given tasks and returns those tasks
     * that satisfied filter criterion.
     * @param tasks Vector of tasks to be filtered.
     * @return Filtered tasks.
     */
    public Vector filterTasks(Vector tasks) {
        return tasks;
    }
    
    /** Returns name of filter as text.
     * @return Name of filter as text.
     */
    public String toString() {
        return null;
    }
}