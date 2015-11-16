// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;

public final class gyp extends hhs
{

    private gwy aj;

    public gyp()
    {
    }

    public static void a(ap ap1)
    {
        ap1 = (ac)ap1.a("login.progress");
        if (ap1 == null)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        ap1.a();
        return;
        ap1;
    }

    public static void a(ap ap1, String s, boolean flag)
    {
        if (b(ap1))
        {
            throw new IllegalStateException("Progress dialog is already showing");
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putString("message", s);
            bundle.putBoolean("cancelable", flag);
            s = new gyp();
            s.setArguments(bundle);
            s.a(ap1, "login.progress");
            return;
        }
    }

    public static boolean b(ap ap1)
    {
        return ap1.a("login.progress") != null;
    }

    public Dialog a(Bundle bundle)
    {
        bundle = new ProgressDialog(new ContextThemeWrapper(getActivity(), h.jr));
        bundle.setMessage(getArguments().getString("message"));
        bundle.setProgressStyle(0);
        bundle.setCancelable(getArguments().getBoolean("cancelable"));
        return bundle;
    }

    protected void e(Bundle bundle)
    {
        super.e(bundle);
        aj = (gwy)al.a(gwy);
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        super.onCancel(dialoginterface);
        aj.c();
    }
}
