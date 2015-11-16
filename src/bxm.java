// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class bxm extends hmk
{

    private gqu aj;

    public bxm()
    {
    }

    public static bxm a(String s, String s1, String s2, bxi bxi1)
    {
        bxm bxm1 = new bxm();
        Bundle bundle = new Bundle();
        bundle.putString("conversation_id", s);
        bundle.putString("name", s1);
        bundle.putString("contact", s2);
        bundle.putSerializable("trigger_action", bxi1);
        bxm1.setArguments(bundle);
        return bxm1;
    }

    static void a(bxm bxm1, boolean flag, bxi bxi1, String s, String s1, int i)
    {
        aoa aoa1;
        if (bxm1.c() != null)
        {
            bxm1.c().dismiss();
        }
        aoa1 = dcn.e(((gqu)bxm1.al.a(gqu)).a());
        if (!flag) goto _L2; else goto _L1
_L1:
        bxr.a[bxi1.ordinal()];
        JVM INSTR tableswitch 1 6: default 88
    //                   1 123
    //                   2 134
    //                   3 145
    //                   4 112
    //                   5 156
    //                   6 167;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        (new bxj(bxm1.ak, s, s1)).a(bxm1.ak, i);
        return;
_L7:
        g.a(aoa1, 1866);
        continue; /* Loop/switch isn't completed */
_L4:
        g.a(aoa1, 1867);
        continue; /* Loop/switch isn't completed */
_L5:
        g.a(aoa1, 1865);
        continue; /* Loop/switch isn't completed */
_L6:
        g.a(aoa1, 2621);
        continue; /* Loop/switch isn't completed */
_L8:
        g.a(aoa1, 2335);
        continue; /* Loop/switch isn't completed */
_L9:
        g.a(aoa1, 2442);
        if (true) goto _L3; else goto _L2
_L2:
        switch (bxr.a[bxi1.ordinal()])
        {
        case 1: // '\001'
            g.a(aoa1, 1861);
            break;

        case 4: // '\004'
            g.a(aoa1, 1860);
            break;

        case 2: // '\002'
            g.a(aoa1, 1858);
            break;

        case 3: // '\003'
            g.a(aoa1, 2619);
            break;

        case 6: // '\006'
            g.a(aoa1, 2264);
            break;

        case 5: // '\005'
            g.a(aoa1, 2333);
            break;
        }
        if (true) goto _L3; else goto _L10
_L10:
    }

    public Dialog a(Bundle bundle)
    {
        Object obj;
        String s;
        bxi bxi1;
        View view;
        String s1;
        Button button;
        Button button1;
        Button button2;
        Button button3;
        LinearLayout linearlayout;
        LinearLayout linearlayout1;
        aoa aoa1;
        TextView textview;
        ImageView imageview;
        TextView textview1;
        boolean flag;
        s1 = getArguments().getString("conversation_id");
        s = getArguments().getString("name");
        obj = getArguments().getString("contact");
        bxi1 = (bxi)getArguments().getSerializable("trigger_action");
        view = getActivity().getLayoutInflater().inflate(g.mG, null);
        imageview = (ImageView)view.findViewById(g.mD);
        textview = (TextView)view.findViewById(g.mF);
        textview1 = (TextView)view.findViewById(g.mC);
        button = (Button)view.findViewById(g.mE);
        button1 = (Button)view.findViewById(g.mz);
        button2 = (Button)view.findViewById(g.mB);
        button3 = (Button)view.findViewById(g.my);
        linearlayout = (LinearLayout)view.findViewById(g.mA);
        linearlayout1 = (LinearLayout)view.findViewById(g.mx);
        aoa1 = dcn.e(aj.a());
        bundle = dcn.a(aoa1);
        flag = bhv.a(((String) (obj)));
        if (!aoa1.o()) goto _L2; else goto _L1
_L1:
        int i = bxk.a;
_L25:
        int j;
        if (i == bxk.b || i == bxk.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        button.setText(ak.getString(h.ic));
        textview1.setVisibility(8);
_L28:
        bxr.a[bxi1.ordinal()];
        JVM INSTR tableswitch 1 3: default 1154
    //                   1 718
    //                   2 726
    //                   3 726;
           goto _L5 _L6 _L7 _L7
_L5:
        j = g.mu;
_L30:
        imageview.setImageResource(j);
        if (!flag) goto _L9; else goto _L8
_L8:
        bxr.a[bxi1.ordinal()];
        JVM INSTR tableswitch 1 3: default 1157
    //                   1 734
    //                   2 748
    //                   3 762;
           goto _L10 _L11 _L12 _L13
_L10:
        bundle = ak.getString(h.im);
_L31:
        textview.setText(bundle);
        textview.setMovementMethod(new ScrollingMovementMethod());
        button.setAllCaps(true);
        button2.setAllCaps(true);
        button1.setAllCaps(true);
        button3.setAllCaps(true);
        bundle = bhv.b(((String) (obj)));
        if (bxi1 != bxi.f || bhv.a(((String) (obj)))) goto _L15; else goto _L14
_L14:
        linearlayout.setVisibility(8);
        button1.setOnClickListener(new bxn(this, flag, bxi1, ((String) (obj)), s1, i));
        button3.setOnClickListener(new bxo(this, aoa1, bundle));
_L63:
        bundle = new android.app.AlertDialog.Builder(getActivity());
        bundle.setView(view);
        obj = dcn.e(((gqu)al.a(gqu)).a());
        if (!flag) goto _L17; else goto _L16
_L16:
        bxr.a[bxi1.ordinal()];
        JVM INSTR tableswitch 1 6: default 1160
    //                   1 991
    //                   2 1001
    //                   3 1011
    //                   4 981
    //                   5 1021
    //                   6 1031;
           goto _L18 _L19 _L20 _L21 _L22 _L23 _L24
_L18:
        return bundle.create();
_L2:
        if (dcn.g().length > 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_609;
        }
        if (aoa1.p() || i == 0 || bundle != null)
        {
            break MISSING_BLOCK_LABEL_609;
        }
        try
        {
            i = bxk.b;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            eev.e("Babel_OffnetworkInvite", "Null pointer exception in onCreateDialog", bundle);
            f();
            return null;
        }
          goto _L25
        i = bxk.c;
          goto _L25
_L4:
        if (!bhv.a(((String) (obj)))) goto _L27; else goto _L26
_L26:
        bundle = ak.getString(h.ig);
_L29:
        textview1.setText(bundle);
          goto _L28
_L27:
label0:
        {
            if (bhv.b(((String) (obj))) == null)
            {
                break MISSING_BLOCK_LABEL_704;
            }
            if (bxi1 != bxi.f)
            {
                break label0;
            }
            bundle = ak.getString(h.ii);
        }
          goto _L29
        bundle = ak.getString(h.io);
          goto _L29
        eev.g("Babel_OffnetworkInvite", "Couldn't get valid invite message");
        bundle = null;
          goto _L29
_L6:
        j = g.mv;
          goto _L30
_L7:
        j = g.mw;
          goto _L30
_L11:
        bundle = ak.getString(h.il);
          goto _L31
_L12:
        bundle = ak.getString(h.in);
          goto _L31
_L13:
        bundle = ak.getString(h.ik);
          goto _L31
_L9:
        if (TextUtils.isEmpty(s))
        {
            bundle = ((Bundle) (obj));
        } else
        {
            bundle = s;
        }
label1:
        {
            bundle = eey.p(bundle);
            if (!TextUtils.isEmpty(bundle))
            {
                break label1;
            }
            bundle = ak.getString(h.is);
        }
          goto _L31
        bxr.a[bxi1.ordinal()];
        JVM INSTR tableswitch 1 3: default 1180
    //                   1 870
    //                   2 892
    //                   3 914;
           goto _L32 _L33 _L34 _L35
_L38:
        if (true) goto _L31; else goto _L36
_L36:
_L40:
        if (true) goto _L38; else goto _L37
_L37:
_L42:
        if (true) goto _L40; else goto _L39
_L39:
_L44:
        if (true) goto _L42; else goto _L41
_L41:
_L46:
        if (true) goto _L44; else goto _L43
_L43:
_L48:
        if (true) goto _L46; else goto _L45
_L45:
_L50:
        if (true) goto _L48; else goto _L47
_L47:
_L52:
        if (true) goto _L50; else goto _L49
_L49:
_L54:
        if (true) goto _L52; else goto _L51
_L51:
_L56:
        if (true) goto _L54; else goto _L53
_L53:
_L58:
        if (true) goto _L56; else goto _L55
_L55:
_L60:
        if (true) goto _L58; else goto _L57
_L57:
_L62:
        if (true) goto _L60; else goto _L59
_L59:
        if (true) goto _L62; else goto _L61
_L61:
_L32:
        bundle = ak.getString(h.iq, new Object[] {
            bundle
        });
          goto _L31
_L33:
        bundle = ak.getString(h.ip, new Object[] {
            bundle
        });
          goto _L31
_L34:
        bundle = ak.getString(h.ir, new Object[] {
            bundle
        });
          goto _L31
_L35:
        bundle = ak.getString(h.ie, new Object[] {
            bundle
        });
          goto _L31
_L15:
        linearlayout1.setVisibility(8);
        button.setOnClickListener(new bxp(this, flag, bxi1, ((String) (obj)), s1, i));
        button2.setOnClickListener(new bxq(this));
          goto _L63
_L22:
        g.a(((aoa) (obj)), 1863);
          goto _L18
_L19:
        g.a(((aoa) (obj)), 1864);
          goto _L18
_L20:
        g.a(((aoa) (obj)), 1862);
          goto _L18
_L21:
        g.a(((aoa) (obj)), 2620);
          goto _L18
_L23:
        g.a(((aoa) (obj)), 2334);
          goto _L18
_L24:
        g.a(((aoa) (obj)), 2442);
          goto _L18
_L17:
        bxr.a[bxi1.ordinal()];
        JVM INSTR tableswitch 1 6: default 1183
    //                   1 1088
    //                   2 1108
    //                   3 1118
    //                   4 1098
    //                   5 1138
    //                   6 1128;
           goto _L64 _L65 _L66 _L67 _L68 _L69 _L70
_L64:
        if (true) goto _L18; else goto _L71
_L71:
_L65:
        g.a(((aoa) (obj)), 1857);
          goto _L18
_L68:
        g.a(((aoa) (obj)), 1856);
          goto _L18
_L66:
        g.a(((aoa) (obj)), 1854);
          goto _L18
_L67:
        g.a(((aoa) (obj)), 2618);
          goto _L18
_L70:
        g.a(((aoa) (obj)), 2263);
          goto _L18
_L69:
        g.a(((aoa) (obj)), 2332);
          goto _L18
    }

    protected void e(Bundle bundle)
    {
        super.e(bundle);
        aj = (gqu)al.a(gqu);
    }

    public void onStart()
    {
        super.onStart();
        if (c() != null)
        {
            char c = '\u015E';
            if (getResources().getConfiguration().orientation == 2)
            {
                c = '\u0258';
            }
            ecn.a(getActivity(), c().getWindow(), c);
        }
    }
}
