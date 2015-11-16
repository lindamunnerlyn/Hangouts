// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.apps.hangouts.hangout.HangoutActivity;

public final class bot extends ac
    implements android.content.DialogInterface.OnClickListener
{

    public bot()
    {
    }

    public static bot a(String s, int i)
    {
        bot bot1 = new bot();
        Bundle bundle = new Bundle();
        bundle.putString("key_error_message", s);
        bundle.putInt("KEY_ERROR", i);
        bot1.setArguments(bundle);
        return bot1;
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
        builder.setPositiveButton(getActivity().getResources().getString(l.hd), this);
        return builder.create();
_L2:
        int i;
        int j;
        int k;
        k = bundle1.getInt("KEY_ERROR");
        j = l.cX;
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
        gdv.a((new StringBuilder(41)).append("Unknown/unexpected error code:").append(k).toString());
        i = j;
_L27:
        bundle = getResources().getString(i);
        if (true) goto _L1; else goto _L26
_L26:
        i = l.cR;
          goto _L27
_L5:
        i = l.ep;
          goto _L27
_L24:
        i = l.cO;
          goto _L27
_L6:
        i = l.cP;
          goto _L27
_L7:
        i = l.cI;
          goto _L27
_L8:
        i = l.cJ;
          goto _L27
_L9:
        i = l.cL;
          goto _L27
_L11:
        i = l.cN;
          goto _L27
_L12:
        gdv.a("This should be handled differently");
        i = j;
          goto _L27
_L13:
        i = l.cK;
          goto _L27
_L15:
        i = l.cZ;
          goto _L27
_L17:
        i = l.cu;
          goto _L27
_L25:
        i = l.cp;
          goto _L27
_L18:
        i = l.cM;
          goto _L27
_L19:
        i = l.cS;
          goto _L27
_L20:
        i = l.cY;
          goto _L27
_L22:
        i = l.cT;
          goto _L27
_L10:
        i = l.eA;
          goto _L27
_L14:
        i = l.da;
          goto _L27
_L23:
        i = l.ep;
          goto _L27
        i = l.cQ;
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
        gdv.a(Integer.valueOf(i), Integer.valueOf(-1));
        onCancel(dialoginterface);
        a();
    }
}
