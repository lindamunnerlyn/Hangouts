// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class hki extends ad
{

    public final hjg lifecycle = new hjg();

    public hki()
    {
    }

    public hjm getLifecycle()
    {
        return lifecycle;
    }

    public void onActivityCreated(Bundle bundle)
    {
        lifecycle.a(bundle);
        super.onActivityCreated(bundle);
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        lifecycle.a(i, j, intent);
        super.onActivityResult(i, j, intent);
    }

    public void onAttach(Activity activity)
    {
        lifecycle.a(activity);
        super.onAttach(activity);
    }

    public void onCreate(Bundle bundle)
    {
        lifecycle.c(bundle);
        super.onCreate(bundle);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        if (lifecycle.a(menu))
        {
            setHasOptionsMenu(true);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        lifecycle.b(bundle);
        return super.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        lifecycle.c();
        super.onDestroy();
    }

    public void onDestroyView()
    {
        lifecycle.a();
        super.onDestroyView();
    }

    public void onDetach()
    {
        lifecycle.d();
        super.onDetach();
    }

    public void onLowMemory()
    {
        lifecycle.r();
        super.onLowMemory();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        return lifecycle.a(menuitem);
    }

    public void onPause()
    {
        lifecycle.b();
        super.onPause();
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        if (lifecycle.b(menu))
        {
            setHasOptionsMenu(true);
        }
    }

    public void onRequestPermissionsResult(int i, String as[], int ai[])
    {
        lifecycle.a(i, as, ai);
    }

    public void onResume()
    {
        h.a(getChildFragmentManager());
        lifecycle.p();
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        lifecycle.d(bundle);
        super.onSaveInstanceState(bundle);
    }

    public void onStart()
    {
        h.a(getChildFragmentManager());
        lifecycle.o();
        super.onStart();
    }

    public void onStop()
    {
        lifecycle.q();
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        lifecycle.a(view, bundle);
        super.onViewCreated(view, bundle);
    }

    public void setUserVisibleHint(boolean flag)
    {
        lifecycle.a(flag);
        super.setUserVisibleHint(flag);
    }
}
