using Android.App;
using Android.Widget;
using Android.OS;
using Android.Support.V7.App;
using Jazzy;
using System.Collections.Generic;
using System;
using Android.Views;

namespace JazzyViewPagerDemo
{
    [Activity(Label = "JazzyViewPagerDemo", MainLauncher = true, Icon = "@drawable/icon",Theme ="@style/Theme.AppCompat.Light.NoActionBar")]
    public class MainActivity : AppCompatActivity
    {
        JazzyViewPager jazzyViewPager;
        List<string> listString = new List<string>();
        protected override void OnCreate(Bundle bundle)
        {
            base.OnCreate(bundle);
            SetContentView (Resource.Layout.Main);

            Android.Support.V7.Widget.Toolbar toolbar = FindViewById<Android.Support.V7.Widget.Toolbar>(Resource.Id.toolbar);
            toolbar.Title = "EDMTDev";
            SetSupportActionBar(toolbar);

            InitData();

            jazzyViewPager = FindViewById<JazzyViewPager>(Resource.Id.viewPager);
            jazzyViewPager.Adapter = new ViewPagerAdapter(jazzyViewPager, this, listString);

        }

        public override bool OnCreateOptionsMenu(IMenu menu)
        {
            MenuInflater.Inflate(Resource.Menu.menu_main, menu);
            return true;
        }

        public override bool OnOptionsItemSelected(IMenuItem item)
        {
            int Id = item.ItemId;
            if (Id == Resource.Id.standard)
                jazzyViewPager.TransitionEffect = JazzyEffects.Standard;
            else if (Id == Resource.Id.accordion)
                jazzyViewPager.TransitionEffect = JazzyEffects.Accordion;
            else if (Id == Resource.Id.cube)
                jazzyViewPager.TransitionEffect = JazzyEffects.Cube;
            else if (Id == Resource.Id.fade)
                jazzyViewPager.TransitionEffect = JazzyEffects.Fade;
            else if (Id == Resource.Id.flip)
                jazzyViewPager.TransitionEffect = JazzyEffects.Flip;
            else if (Id == Resource.Id.flipAway)
                jazzyViewPager.TransitionEffect = JazzyEffects.FlipAway;
            else if (Id == Resource.Id.rotateUp)
                jazzyViewPager.TransitionEffect = JazzyEffects.RotateUp;
            else if (Id == Resource.Id.rotateDown)
                jazzyViewPager.TransitionEffect = JazzyEffects.RotateDown;
            else if (Id == Resource.Id.stack)
                jazzyViewPager.TransitionEffect = JazzyEffects.Stack;
            else if (Id == Resource.Id.tablet)
                jazzyViewPager.TransitionEffect = JazzyEffects.Tablet;
            else if (Id == Resource.Id.zoom)
                jazzyViewPager.TransitionEffect = JazzyEffects.Zoom;
            else
                jazzyViewPager.TransitionEffect = JazzyEffects.Standard;


            return true;
        }

        private void InitData()
        {
            for (int i = 1; i <= 10; i++)
                listString.Add("This is item " + i);
        }
    }
}

