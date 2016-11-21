package md59616efb441c2420e1c17d5e26569cfc0;


public class ViewPagerAdapter
	extends md5635ca81db9bbed3c32a4d250384b1e0c.JazzyPagerAdapter
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getCount:()I:GetGetCountHandler\n" +
			"n_instantiateItem:(Landroid/view/ViewGroup;I)Ljava/lang/Object;:GetInstantiateItem_Landroid_view_ViewGroup_IHandler\n" +
			"n_destroyItem:(Landroid/view/ViewGroup;ILjava/lang/Object;)V:GetDestroyItem_Landroid_view_ViewGroup_ILjava_lang_Object_Handler\n" +
			"";
		mono.android.Runtime.register ("JazzyViewPagerDemo.ViewPagerAdapter, JazzyViewPagerDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", ViewPagerAdapter.class, __md_methods);
	}


	public ViewPagerAdapter () throws java.lang.Throwable
	{
		super ();
		if (getClass () == ViewPagerAdapter.class)
			mono.android.TypeManager.Activate ("JazzyViewPagerDemo.ViewPagerAdapter, JazzyViewPagerDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public ViewPagerAdapter (md5635ca81db9bbed3c32a4d250384b1e0c.JazzyViewPager p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == ViewPagerAdapter.class)
			mono.android.TypeManager.Activate ("JazzyViewPagerDemo.ViewPagerAdapter, JazzyViewPagerDemo, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Jazzy.JazzyViewPager, JazzyViewPager, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", this, new java.lang.Object[] { p0 });
	}


	public int getCount ()
	{
		return n_getCount ();
	}

	private native int n_getCount ();


	public java.lang.Object instantiateItem (android.view.ViewGroup p0, int p1)
	{
		return n_instantiateItem (p0, p1);
	}

	private native java.lang.Object n_instantiateItem (android.view.ViewGroup p0, int p1);


	public void destroyItem (android.view.ViewGroup p0, int p1, java.lang.Object p2)
	{
		n_destroyItem (p0, p1, p2);
	}

	private native void n_destroyItem (android.view.ViewGroup p0, int p1, java.lang.Object p2);

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
