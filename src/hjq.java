// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class hjq extends hjy
    implements hoe
{

    public final hny c = new hny();

    public hjq()
    {
    }

    public hof getLifecycle()
    {
        return c;
    }

    public void onActivityCreated(Bundle bundle)
    {
        c.a(bundle);
        super.onActivityCreated(bundle);
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        c.a(i, j, intent);
        super.onActivityResult(i, j, intent);
    }

    public void onAttach(Activity activity)
    {
        c.a(activity);
        super.onAttach(activity);
    }

    public void onCreate(Bundle bundle)
    {
        c.c(bundle);
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        c.b(bundle);
        return super.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        c.c();
        super.onDestroy();
    }

    public void onDestroyView()
    {
        c.a();
        super.onDestroyView();
    }

    public void onLowMemory()
    {
        c.t();
        super.onLowMemory();
    }

    public void onPause()
    {
        c.b();
        super.onPause();
    }

    public void onRequestPermissionsResult(int i, String as[], int ai[])
    {
        c.a(i, as, ai);
    }

    public void onResume()
    {
        c.r();
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        c.d(bundle);
        super.onSaveInstanceState(bundle);
    }

    public void onStart()
    {
        c.q();
        super.onStart();
    }

    public void onStop()
    {
        c.s();
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        c.a(view, bundle);
        super.onViewCreated(view, bundle);
    }

    public void setUserVisibleHint(boolean flag)
    {
        c.a(flag);
        super.setUserVisibleHint(flag);
    }
}
