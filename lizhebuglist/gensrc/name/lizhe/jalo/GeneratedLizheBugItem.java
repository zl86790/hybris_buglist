/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jan 30, 2019 5:51:47 PM                     ---
 * ----------------------------------------------------------------
 */
package name.lizhe.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import name.lizhe.constants.LizhebuglistConstants;

/**
 * Generated class for type {@link name.lizhe.jalo.LizheBugItem LizheBugItem}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedLizheBugItem extends GenericItem
{
	/** Qualifier of the <code>LizheBugItem.bugnumber</code> attribute **/
	public static final String BUGNUMBER = "bugnumber";
	/** Qualifier of the <code>LizheBugItem.bugname</code> attribute **/
	public static final String BUGNAME = "bugname";
	/** Qualifier of the <code>LizheBugItem.bugdescription</code> attribute **/
	public static final String BUGDESCRIPTION = "bugdescription";
	/** Qualifier of the <code>LizheBugItem.bugcomments</code> attribute **/
	public static final String BUGCOMMENTS = "bugcomments";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(BUGNUMBER, AttributeMode.INITIAL);
		tmp.put(BUGNAME, AttributeMode.INITIAL);
		tmp.put(BUGDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(BUGCOMMENTS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LizheBugItem.bugcomments</code> attribute.
	 * @return the bugcomments
	 */
	public String getBugcomments(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUGCOMMENTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LizheBugItem.bugcomments</code> attribute.
	 * @return the bugcomments
	 */
	public String getBugcomments()
	{
		return getBugcomments( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LizheBugItem.bugcomments</code> attribute. 
	 * @param value the bugcomments
	 */
	public void setBugcomments(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUGCOMMENTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LizheBugItem.bugcomments</code> attribute. 
	 * @param value the bugcomments
	 */
	public void setBugcomments(final String value)
	{
		setBugcomments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LizheBugItem.bugdescription</code> attribute.
	 * @return the bugdescription
	 */
	public String getBugdescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUGDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LizheBugItem.bugdescription</code> attribute.
	 * @return the bugdescription
	 */
	public String getBugdescription()
	{
		return getBugdescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LizheBugItem.bugdescription</code> attribute. 
	 * @param value the bugdescription
	 */
	public void setBugdescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUGDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LizheBugItem.bugdescription</code> attribute. 
	 * @param value the bugdescription
	 */
	public void setBugdescription(final String value)
	{
		setBugdescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LizheBugItem.bugname</code> attribute.
	 * @return the bugname
	 */
	public String getBugname(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUGNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LizheBugItem.bugname</code> attribute.
	 * @return the bugname
	 */
	public String getBugname()
	{
		return getBugname( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LizheBugItem.bugname</code> attribute. 
	 * @param value the bugname
	 */
	public void setBugname(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUGNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LizheBugItem.bugname</code> attribute. 
	 * @param value the bugname
	 */
	public void setBugname(final String value)
	{
		setBugname( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LizheBugItem.bugnumber</code> attribute.
	 * @return the bugnumber
	 */
	public String getBugnumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUGNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LizheBugItem.bugnumber</code> attribute.
	 * @return the bugnumber
	 */
	public String getBugnumber()
	{
		return getBugnumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LizheBugItem.bugnumber</code> attribute. 
	 * @param value the bugnumber
	 */
	public void setBugnumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUGNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LizheBugItem.bugnumber</code> attribute. 
	 * @param value the bugnumber
	 */
	public void setBugnumber(final String value)
	{
		setBugnumber( getSession().getSessionContext(), value );
	}
	
}
