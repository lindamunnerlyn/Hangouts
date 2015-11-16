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

public class hkh extends ac
{

    public final hjg am = new hjg();

    public hkh()
    {
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        am.a(i, j, intent);
        super.onActivityResult(i, j, intent);
    }

    public void onAttach(Activity activity)
    {
        am.a(activity);
        super.onAttach(activity);
    }

    public void onCreate(Bundle bundle)
    {
        am.c(bundle);
        super.onCreate(bundle);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        if (am.a(menu))
        {
            setHasOptionsMenu(true);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        am.b(bundle);
        return super.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        am.c();
        super.onDestroy();
    }

    public void onDestroyView()
    {
        am.a();
        super.onDestroyView();
    }

    public void onDetach()
    {
        am.d();
        super.onDetach();
    }

    public void onLowMemory()
    {
        am.r();
        super.onLowMemory();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        return am.a(menuitem);
    }

    public void onPause()
    {
        am.b();
        super.onPause();
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        if (am.b(menu))
        {
            setHasOptionsMenu(true);
        }
    }

    public void onRequestPermissionsResult(int i, String as[], int ai[])
    {
        am.a(i, as, ai);
    }

    public void onResume()
    {
        h.a(getChildFragmentManager());
        am.p();
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        am.d(bundle);
        super.onSaveInstanceState(bundle);
    }

    public void onStart()
    {
        h.a(getChildFragmentManager());
        am.o();
        super.onStart();
    }

    public void onStop()
    {
        am.q();
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        am.a(view, bundle);
        super.onViewCreated(view, bundle);
    }

    public void setUserVisibleHint(boolean flag)
    {
        am.a(flag);
        super.setUserVisibleHint(flag);
    }
}
