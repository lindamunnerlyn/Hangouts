// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.apps.hangouts.hangout.HangoutActivity;

public final class bok extends ac
    implements android.content.DialogInterface.OnClickListener
{

    public bok()
    {
    }

    public static bok a(String s, int i)
    {
        bok bok1 = new bok();
        Bundle bundle = new Bundle();
        bundle.putString("key_error_message", s);
        bundle.putInt("KEY_ERROR", i);
        bok1.setArguments(bundle);
        return bok1;
    }

    public Dialog a(Bundle bundle)
    {
        android.app.AlertDialog.Builder builder;
        Bundle bundle1;
        builder = new android.app.AlertDialog.Builder(getActivity());
        bundle1 = getArguments();
        bundle = bundle1.getString("key_error_message");
        if (bundle == null) goto _L2; else goto _L1
_L1:
        builder.setMessage(bundle);
        builder.setPositiveButton(getActivity().getResources().getString(l.hJ), this);
        return builder.create();
_L2:
        int i;
        int j;
        int k;
        k = bundle1.getInt("KEY_ERROR");
        j = l._flddo;
        i = j;
        k;
        JVM INSTR lookupswitch 40: default 408
    //                   1: 450
    //                   2: 458
    //                   3: 474
    //                   4: 474
    //                   5: 474
    //                   6: 474
    //                   7: 474
    //                   8: 474
    //                   9: 474
    //                   10: 474
    //                   11: 474
    //                   12: 482
    //                   13: 490
    //                   14: 498
    //                   15: 590
    //                   16: 450
    //                   17: 506
    //                   18: 506
    //                   19: 514
    //                   20: 526
    //                   21: 598
    //                   22: 598
    //                   23: 598
    //                   24: 598
    //                   25: 534
    //                   28: 614
    //                   29: 598
    //                   1000: 542
    //                   1001: 558
    //                   1002: 566
    //                   1003: 598
    //                   1006: 574
    //                   1007: 437
    //                   1008: 582
    //                   1009: 590
    //                   1012: 606
    //                   1013: 466
    //                   1014: 437
    //                   1016: 450
    //                   1019: 550;
           goto _L3 _L4 _L5 _L6 _L6 _L6 _L6 _L6 _L6 _L6 _L6 _L6 _L7 _L8 _L9 _L10 _L4 _L11 _L11 _L12 _L13 _L14 _L14 _L14 _L14 _L15 _L16 _L14 _L17 _L18 _L19 _L14 _L20 _L21 _L22 _L10 _L23 _L24 _L21 _L4 _L25
_L16:
        break MISSING_BLOCK_LABEL_614;
_L4:
        break; /* Loop/switch isn't completed */
_L21:
        break; /* Loop/switch isn't completed */
_L3:
        gbh.a((new StringBuilder(41)).append("Unknown/unexpected error code:").append(k).toString());
        i = j;
_L27:
        bundle = getResources().getString(i);
        if (true) goto _L1; else goto _L26
_L26:
        i = l.di;
          goto _L27
_L5:
        i = l.eG;
          goto _L27
_L24:
        i = l.df;
          goto _L27
_L6:
        i = l.dg;
          goto _L27
_L7:
        i = l.cZ;
          goto _L27
_L8:
        i = l.da;
          goto _L27
_L9:
        i = l.dc;
          goto _L27
_L11:
        i = l.de;
          goto _L27
_L12:
        gbh.a("This should be handled differently");
        i = j;
          goto _L27
_L13:
        i = l.db;
          goto _L27
_L15:
        i = l.dq;
          goto _L27
_L17:
        i = l.cL;
          goto _L27
_L25:
        i = l.cG;
          goto _L27
_L18:
        i = l.dd;
          goto _L27
_L19:
        i = l.dj;
          goto _L27
_L20:
        i = l.dp;
          goto _L27
_L22:
        i = l.dk;
          goto _L27
_L10:
        i = l.eR;
          goto _L27
_L14:
        i = l.dr;
          goto _L27
_L23:
        i = l.eG;
          goto _L27
        i = l.dh;
          goto _L27
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        dialoginterface = (HangoutActivity)getActivity();
        if (dialoginterface != null)
        {
            dialoginterface.n();
        }
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        gbh.a(Integer.valueOf(i), Integer.valueOf(-1));
        onCancel(dialoginterface);
        a();
    }
}
