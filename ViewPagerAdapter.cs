using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Java.Lang;
using Jazzy;

namespace JazzyViewPagerDemo
{
    class ViewPagerAdapter : JazzyPagerAdapter
    {
        private Activity activity;
        private List<string> listString;
        public ViewPagerAdapter(JazzyViewPager jazzy,Activity activity,List<string> listString) : base(jazzy)
        {
            this.activity = activity;
            this.listString = listString;
        }

        public override int Count
        {
            get
            {
                return listString.Count;
            }
        }

        public override Java.Lang.Object InstantiateItem(ViewGroup container, int position)
        {
            LayoutInflater inflater = (LayoutInflater)activity.BaseContext.GetSystemService(Context.LayoutInflaterService);
            View itemView = inflater.Inflate(Resource.Layout.viewpager_layout, container, false);

            TextView txtView = itemView.FindViewById<TextView>(Resource.Id.textView);
            txtView.Text = listString[position];

            SetObjectForPosition(itemView, position); // Jazzy add
            container.AddView(itemView);
            return itemView;
        }

        public override void DestroyItem(ViewGroup container, int position, Java.Lang.Object @object)
        {
            var view = FindViewFromObject(position);
            container.RemoveView(view);
        }
    }
}