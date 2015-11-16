// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class bgo extends ac
{

    private android.content.DialogInterface.OnCancelListener aj;

    public bgo()
    {
    }

    public Dialog a(Bundle bundle)
    {
        bundle = new ProgressDialog(getActivity());
        bundle.setMessage(getArguments().getString("message"));
        bundle.setProgressStyle(0);
        return bundle;
    }

    public void a(android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        aj = oncancellistener;
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        if (aj != null)
        {
            aj.onCancel(dialoginterface);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (getParentFragment() == null)
        {
            setRetainInstance(true);
        }
    }

    public void onDestroyView()
    {
        if (c() != null && getRetainInstance())
        {
            c().setDismissMessage(null);
        }
        super.onDestroyView();
    }
}
