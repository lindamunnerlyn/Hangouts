// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class gyo extends hhs
    implements android.content.DialogInterface.OnClickListener
{

    private gwy aj;

    public gyo()
    {
    }

    static void a(ap ap)
    {
        (new gyo()).a(ap, "irrecoverable_error");
    }

    public Dialog a(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        bundle.setTitle(g.sW);
        bundle.setMessage(g.sU);
        bundle.setPositiveButton(g.sV, this);
        bundle.setNegativeButton(0x1040000, this);
        return bundle.create();
    }

    protected void e(Bundle bundle)
    {
        super.e(bundle);
        aj = (gwy)al.a(gwy);
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        aj.c();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1)
        {
            aj.d();
            return;
        } else
        {
            aj.c();
            return;
        }
    }
}
