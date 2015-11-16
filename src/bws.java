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

public final class bws extends hhs
{

    private gmo aj;

    public bws()
    {
    }

    public static bws a(String s, String s1, String s2, bwr bwr1)
    {
        bws bws1 = new bws();
        Bundle bundle = new Bundle();
        bundle.putString("conversation_id", s);
        bundle.putString("name", s1);
        bundle.putString("contact", s2);
        bundle.putSerializable("trigger_action", bwr1);
        bws1.setArguments(bundle);
        return bws1;
    }

    static void a(bws bws1, boolean flag, bwr bwr1, String s, String s1, String s2, int i)
    {
        Object obj;
        if (bws1.c() != null)
        {
            bws1.c().dismiss();
        }
        obj = dbf.e(((gmo)bws1.al.a(gmo)).a());
        if (!flag) goto _L2; else goto _L1
_L1:
        bwx.a[bwr1.ordinal()];
        JVM INSTR tableswitch 1 6: default 88
    //                   1 154
    //                   2 165
    //                   3 176
    //                   4 143
    //                   5 187
    //                   6 198;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        obj = (bwm)bws1.al.b(bwm);
        (new bwn(dbf.e(bws1.aj.a()), s, s1, s2, bwr1, bws1.getContext())).a(i, ((bwm) (obj)), bws1.al);
        return;
_L7:
        g.a(((ani) (obj)), 1866);
        continue; /* Loop/switch isn't completed */
_L4:
        g.a(((ani) (obj)), 1867);
        continue; /* Loop/switch isn't completed */
_L5:
        g.a(((ani) (obj)), 1865);
        continue; /* Loop/switch isn't completed */
_L6:
        g.a(((ani) (obj)), 2621);
        continue; /* Loop/switch isn't completed */
_L8:
        g.a(((ani) (obj)), 2335);
        continue; /* Loop/switch isn't completed */
_L9:
        g.a(((ani) (obj)), 2442);
        if (true) goto _L3; else goto _L2
_L2:
        switch (bwx.a[bwr1.ordinal()])
        {
        case 1: // '\001'
            g.a(((ani) (obj)), 1861);
            break;

        case 4: // '\004'
            g.a(((ani) (obj)), 1860);
            break;

        case 2: // '\002'
            g.a(((ani) (obj)), 1858);
            break;

        case 3: // '\003'
            g.a(((ani) (obj)), 2619);
            break;

        case 6: // '\006'
            g.a(((ani) (obj)), 2264);
            break;

        case 5: // '\005'
            g.a(((ani) (obj)), 2333);
            break;
        }
        if (true) goto _L3; else goto _L10
_L10:
    }

    public Dialog a(Bundle bundle)
    {
        Object obj;
        String s;
        bwr bwr1;
        View view;
        String s1;
        Button button;
        Button button1;
        Button button2;
        Button button3;
        LinearLayout linearlayout;
        LinearLayout linearlayout1;
        ani ani1;
        TextView textview;
        ImageView imageview;
        TextView textview1;
        boolean flag;
        s1 = getArguments().getString("conversation_id");
        obj = getArguments().getString("name");
        s = getArguments().getString("contact");
        bwr1 = (bwr)getArguments().getSerializable("trigger_action");
        view = getActivity().getLayoutInflater().inflate(g.gO, null);
        imageview = (ImageView)view.findViewById(h.ed);
        textview = (TextView)view.findViewById(h.ef);
        textview1 = (TextView)view.findViewById(h.ec);
        button = (Button)view.findViewById(h.ee);
        button1 = (Button)view.findViewById(h.dZ);
        button2 = (Button)view.findViewById(h.eb);
        button3 = (Button)view.findViewById(h.dY);
        linearlayout = (LinearLayout)view.findViewById(h.ea);
        linearlayout1 = (LinearLayout)view.findViewById(h.dX);
        ani1 = dbf.e(aj.a());
        bundle = dbf.a(ani1);
        flag = bhj.a(s);
        if (!ani1.q()) goto _L2; else goto _L1
_L1:
        int i = bwp.a;
_L25:
        int j;
        if (i == bwp.b || i == bwp.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        button.setText(getActivity().getString(l.j));
        textview1.setVisibility(8);
_L28:
        bwx.a[bwr1.ordinal()];
        JVM INSTR tableswitch 1 3: default 1154
    //                   1 718
    //                   2 726
    //                   3 726;
           goto _L5 _L6 _L7 _L7
_L5:
        j = com.google.android.apps.hangouts.R.drawable.bQ;
_L30:
        imageview.setImageResource(j);
        if (!flag) goto _L9; else goto _L8
_L8:
        bwx.a[bwr1.ordinal()];
        JVM INSTR tableswitch 1 3: default 1157
    //                   1 734
    //                   2 748
    //                   3 762;
           goto _L10 _L11 _L12 _L13
_L10:
        bundle = getActivity().getString(l.hC);
_L31:
        textview.setText(bundle);
        textview.setMovementMethod(new ScrollingMovementMethod());
        button.setAllCaps(true);
        button2.setAllCaps(true);
        button1.setAllCaps(true);
        button3.setAllCaps(true);
        bundle = bhj.b(s);
        if (bwr1 != bwr.f || bhj.a(s)) goto _L15; else goto _L14
_L14:
        linearlayout.setVisibility(8);
        button1.setOnClickListener(new bwt(this, flag, bwr1, ((String) (obj)), s, s1, i));
        button3.setOnClickListener(new bwu(this, ani1, bundle));
_L63:
        bundle = new android.app.AlertDialog.Builder(getActivity());
        bundle.setView(view);
        obj = dbf.e(((gmo)al.a(gmo)).a());
        if (!flag) goto _L17; else goto _L16
_L16:
        bwx.a[bwr1.ordinal()];
        JVM INSTR tableswitch 1 6: default 1160
    //                   1 992
    //                   2 1002
    //                   3 1012
    //                   4 982
    //                   5 1022
    //                   6 1032;
           goto _L18 _L19 _L20 _L21 _L22 _L23 _L24
_L18:
        return bundle.create();
_L2:
        if (dbf.g().length > 0)
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
        if (ani1.r() || i == 0 || bundle != null)
        {
            break MISSING_BLOCK_LABEL_609;
        }
        try
        {
            i = bwp.b;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            ebw.e("Babel", "Null pointer exception in OffnetworkInviteDialogFragment.onCreateDialog", bundle);
            f();
            return null;
        }
          goto _L25
        i = bwp.c;
          goto _L25
_L4:
        if (!bhj.a(s)) goto _L27; else goto _L26
_L26:
        bundle = getActivity().getString(l.hw);
_L29:
        textview1.setText(bundle);
          goto _L28
_L27:
label0:
        {
            if (bhj.b(s) == null)
            {
                break MISSING_BLOCK_LABEL_704;
            }
            if (bwr1 != bwr.f)
            {
                break label0;
            }
            bundle = getActivity().getString(l.hy);
        }
          goto _L29
        bundle = getActivity().getString(l.hE);
          goto _L29
        ebw.g("Babel", "ContactInviteDialogFragment: couldn't get valid invite message");
        bundle = null;
          goto _L29
_L6:
        j = com.google.android.apps.hangouts.R.drawable.bR;
          goto _L30
_L7:
        j = com.google.android.apps.hangouts.R.drawable.bS;
          goto _L30
_L11:
        bundle = getActivity().getString(l.hB);
          goto _L31
_L12:
        bundle = getActivity().getString(l.hD);
          goto _L31
_L13:
        bundle = getActivity().getString(l.hA);
          goto _L31
_L9:
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            bundle = s;
        } else
        {
            bundle = ((Bundle) (obj));
        }
label1:
        {
            bundle = ebz.p(bundle);
            if (!TextUtils.isEmpty(bundle))
            {
                break label1;
            }
            bundle = getActivity().getString(l.hI);
        }
          goto _L31
        bwx.a[bwr1.ordinal()];
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
        bundle = getActivity().getString(l.hG, new Object[] {
            bundle
        });
          goto _L31
_L33:
        bundle = getActivity().getString(l.hF, new Object[] {
            bundle
        });
          goto _L31
_L34:
        bundle = getActivity().getString(l.hH, new Object[] {
            bundle
        });
          goto _L31
_L35:
        bundle = getActivity().getString(l.hu, new Object[] {
            bundle
        });
          goto _L31
_L15:
        linearlayout1.setVisibility(8);
        button.setOnClickListener(new bwv(this, flag, bwr1, ((String) (obj)), s, s1, i));
        button2.setOnClickListener(new bww(this));
          goto _L63
_L22:
        g.a(((ani) (obj)), 1863);
          goto _L18
_L19:
        g.a(((ani) (obj)), 1864);
          goto _L18
_L20:
        g.a(((ani) (obj)), 1862);
          goto _L18
_L21:
        g.a(((ani) (obj)), 2620);
          goto _L18
_L23:
        g.a(((ani) (obj)), 2334);
          goto _L18
_L24:
        g.a(((ani) (obj)), 2442);
          goto _L18
_L17:
        bwx.a[bwr1.ordinal()];
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
        g.a(((ani) (obj)), 1857);
          goto _L18
_L68:
        g.a(((ani) (obj)), 1856);
          goto _L18
_L66:
        g.a(((ani) (obj)), 1854);
          goto _L18
_L67:
        g.a(((ani) (obj)), 2618);
          goto _L18
_L70:
        g.a(((ani) (obj)), 2263);
          goto _L18
_L69:
        g.a(((ani) (obj)), 2332);
          goto _L18
    }

    protected void e(Bundle bundle)
    {
        super.e(bundle);
        aj = (gmo)al.a(gmo);
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
            dzj.a(getActivity(), c().getWindow(), c);
        }
    }
}
