// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.google.android.libraries.social.settings.PreferenceScreen;

public class hjy extends ad
    implements hkk
{

    private ListView a;
    private boolean b;
    private boolean c;
    public hkh d;
    private Handler e;
    private final Runnable f = new hka(this);
    private android.view.View.OnKeyListener g;

    public hjy()
    {
        e = new hjz(this);
        g = new hkb(this);
    }

    private void a()
    {
        PreferenceScreen preferencescreen = c();
        if (preferencescreen != null)
        {
            preferencescreen.a(d());
        }
    }

    static void a(hjy hjy1)
    {
        hjy1.a();
    }

    static ListView b(hjy hjy1)
    {
        return hjy1.a;
    }

    public void a(PreferenceScreen preferencescreen)
    {
        if (d.a(preferencescreen) && preferencescreen != null)
        {
            b = true;
            if (c && !e.hasMessages(1))
            {
                e.obtainMessage(1).sendToTarget();
            }
        }
    }

    public boolean a(hjr hjr1)
    {
        if (hjr1.k() != null && (getActivity() instanceof hkc))
        {
            return ((hkc)getActivity()).a();
        } else
        {
            return false;
        }
    }

    public hkh b()
    {
        return d;
    }

    public PreferenceScreen c()
    {
        return d.d();
    }

    public ListView d()
    {
        if (a == null)
        {
            View view = getView();
            if (view == null)
            {
                throw new IllegalStateException("Content view not yet created");
            }
            view = view.findViewById(0x102000a);
            if (!(view instanceof ListView))
            {
                throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
            }
            a = (ListView)view;
            if (a == null)
            {
                throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            a.setOnKeyListener(g);
            e.post(f);
        }
        return a;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        if (b)
        {
            a();
        }
        c = true;
        if (bundle != null)
        {
            bundle = bundle.getBundle("settings:preferences");
            if (bundle != null)
            {
                PreferenceScreen preferencescreen = c();
                if (preferencescreen != null)
                {
                    preferencescreen.d(bundle);
                }
            }
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        d.a(i, j, intent);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        d = new hkh(getActivity());
        d.a(this);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(g.tR, viewgroup, false);
    }

    public void onDestroy()
    {
        d.i();
        super.onDestroy();
    }

    public void onDestroyView()
    {
        a = null;
        e.removeCallbacks(f);
        e.removeMessages(1);
        super.onDestroyView();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferencescreen = c();
        if (preferencescreen != null)
        {
            Bundle bundle1 = new Bundle();
            preferencescreen.b(bundle1);
            bundle.putBundle("settings:preferences", bundle1);
        }
    }

    public void onStart()
    {
        super.onStart();
        d.a(this);
    }

    public void onStop()
    {
        super.onStop();
        d.h();
        d.a(null);
    }
}
