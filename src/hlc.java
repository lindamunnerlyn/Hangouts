// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Map;

public final class hlc extends ac
{

    public View aj;
    public Animator ak;
    public boolean al;

    public hlc()
    {
    }

    public static hlc a(String s, String s1, ad ad)
    {
        Bundle bundle = new Bundle();
        bundle.putString("message", s);
        if (s1 != null)
        {
            bundle.putString("submessage", s1);
        }
        bundle.putBoolean("is_animated", true);
        s = new hlc();
        s.setArguments(bundle);
        s.b(false);
        s.setTargetFragment(ad, 0);
        return s;
    }

    private void q()
    {
        if (ak == null)
        {
            HashMap hashmap = new HashMap(3);
            hashmap.put("LEFT 1", aj.findViewById(l.ua));
            hashmap.put("CENTER 1", aj.findViewById(l.ub));
            hashmap.put("RIGHT 1", aj.findViewById(l.uc));
            if (gum.a == null)
            {
                gum.a = new gum();
            }
            ak = gum.a.a(getActivity(), g.tU, hashmap);
            ak.addListener(new hld(this));
        }
        if (ak.isStarted())
        {
            ak.cancel();
        }
        ak.start();
    }

    private boolean r()
    {
        getActivity();
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag && getArguments().getBoolean("is_animated");
    }

    public Dialog a(Bundle bundle)
    {
        Bundle bundle1 = getArguments();
        if (r())
        {
            return super.a(bundle);
        }
        bundle = new ProgressDialog(getActivity());
        if (bundle1.containsKey("title"))
        {
            bundle.setTitle(bundle1.getString("title"));
        }
        bundle.setMessage(bundle1.getString("message"));
        bundle.setCanceledOnTouchOutside(e());
        bundle.setProgressStyle(0);
        return bundle;
    }

    public void a(ap ap, String s)
    {
        try
        {
            super.a(ap, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ap ap)
        {
            return;
        }
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        super.onCancel(dialoginterface);
        if (getTargetFragment() instanceof hle)
        {
            getArguments();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (r())
        {
            a(d());
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (!r())
        {
            return super.onCreateView(layoutinflater, viewgroup, bundle);
        }
        aj = layoutinflater.inflate(g.tS, null);
        layoutinflater = (TextView)aj.findViewById(l.ud);
        viewgroup = getArguments().getString("message");
        layoutinflater.setText(viewgroup);
        layoutinflater.setContentDescription(viewgroup);
        layoutinflater = (TextView)aj.findViewById(l.ue);
        viewgroup = getArguments().getString("submessage");
        if (!TextUtils.isEmpty(viewgroup))
        {
            layoutinflater.setText(viewgroup);
            layoutinflater.setContentDescription(viewgroup);
            layoutinflater.setVisibility(0);
        }
        q();
        return aj;
    }

    public void onPause()
    {
        super.onPause();
        al = true;
        if (ak != null && ak.isStarted())
        {
            ak.cancel();
        }
    }

    public void onResume()
    {
        super.onResume();
        al = false;
        if (ak != null && !ak.isStarted())
        {
            q();
        }
    }
}
