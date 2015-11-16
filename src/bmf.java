// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;

public final class bmf extends ac
{

    public bmf()
    {
    }

    public static bmf b(int i)
    {
        bmf bmf1 = new bmf();
        Bundle bundle = new Bundle();
        bundle.putInt("action_index", i);
        bmf1.setArguments(bundle);
        return bmf1;
    }

    public Dialog a(Bundle bundle)
    {
        android.app.AlertDialog.Builder builder;
        android.app.AlertDialog.Builder builder1;
        int i;
        i = getArguments().getInt("action_index");
        if (i < 0 || i > 2)
        {
            return null;
        }
        builder = new android.app.AlertDialog.Builder(getActivity());
        builder1 = builder.setTitle(l.kA);
        bundle = getActivity().getResources();
        i;
        JVM INSTR tableswitch 0 2: default 80
    //                   0 110
    //                   1 167
    //                   2 188;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder(62)).append("SmsStorageLowWarningFragment: invalid action index ").append(i).toString());
_L2:
        bundle = bundle.getString(l.aL, new Object[] {
            bmb.a
        });
_L6:
        builder1.setMessage(bundle).setNegativeButton(0x1040000, new bmh(this)).setPositiveButton(0x104000a, new bmg(this, i));
        return builder.create();
_L3:
        bundle = bundle.getString(l.aR, new Object[] {
            bmb.a
        });
        continue; /* Loop/switch isn't completed */
_L4:
        bundle = bundle.getString(l.B, new Object[] {
            bmb.a
        });
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        ((bmb)getTargetFragment()).getActivity().finish();
    }
}
