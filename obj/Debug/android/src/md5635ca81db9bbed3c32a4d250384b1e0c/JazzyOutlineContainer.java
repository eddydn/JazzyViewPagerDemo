package md5635ca81db9bbed3c32a4d250384b1e0c;


public class JazzyOutlineContainer
	extends android.widget.FrameLayout
	implements
		mono.android.IGCUserPeer,
		android.graphics.drawable.Animatable
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_dispatchDraw:(Landroid/graphics/Canvas;)V:GetDispatchDraw_Landroid_graphics_Canvas_Handler\n" +
			"n_isRunning:()Z:GetIsRunningHandler:Android.Graphics.Drawables.IAnimatableInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_start:()V:GetStartHandler:Android.Graphics.Drawables.IAnimatableInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_stop:()V:GetStopHandler:Android.Graphics.Drawables.IAnimatableInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Jazzy.JazzyOutlineContainer, JazzyViewPager, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", JazzyOutlineContainer.class, __md_methods);
	}


	public JazzyOutlineContainer (android.content.Context p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == JazzyOutlineContainer.class)
			mono.android.TypeManager.Activate ("Jazzy.JazzyOutlineContainer, JazzyViewPager, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public JazzyOutlineContainer (android.content.Context p0, android.util.AttributeSet p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == JazzyOutlineContainer.class)
			mono.android.TypeManager.Activate ("Jazzy.JazzyOutlineContainer, JazzyViewPager, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public JazzyOutlineContainer (android.content.Context p0, android.util.AttributeSet p1, int p2) throws java.lang.Throwable
	{
		super (p0, p1, p2);
		if (getClass () == JazzyOutlineContainer.class)
			mono.android.TypeManager.Activate ("Jazzy.JazzyOutlineContainer, JazzyViewPager, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public JazzyOutlineContainer (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) throws java.lang.Throwable
	{
		super (p0, p1, p2, p3);
		if (getClass () == JazzyOutlineContainer.class)
			mono.android.TypeManager.Activate ("Jazzy.JazzyOutlineContainer, JazzyViewPager, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public void dispatchDraw (android.graphics.Canvas p0)
	{
		n_dispatchDraw (p0);
	}

	private native void n_dispatchDraw (android.graphics.Canvas p0);


	public boolean isRunning ()
	{
		return n_isRunning ();
	}

	private native boolean n_isRunning ();


	public void start ()
	{
		n_start ();
	}

	private native void n_start ();


	public void stop ()
	{
		n_stop ();
	}

	private native void n_stop ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
