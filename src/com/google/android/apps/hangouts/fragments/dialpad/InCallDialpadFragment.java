// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.fragments.dialpad;

import ad;
import ai;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import ap;
import bmt;
import bnk;
import bpm;
import eev;
import g;
import h;

// Referenced classes of package com.google.android.apps.hangouts.fragments.dialpad:
//            DialpadFragment

public class InCallDialpadFragment extends ad
    implements bmt
{

    private final bnk a = bnk.a();
    private EditText b;
    private DialpadFragment c;
    private String d;

    public InCallDialpadFragment()
    {
    }

    public void a(int i)
    {
    }

    public void a(int i, boolean flag)
    {
        if (flag) goto _L2; else goto _L1
_L1:
        return;
_L2:
        i;
        JVM INSTR tableswitch 7 18: default 68
    //                   7 196
    //                   8 142
    //                   9 148
    //                   10 154
    //                   11 160
    //                   12 166
    //                   13 172
    //                   14 178
    //                   15 184
    //                   16 190
    //                   17 208
    //                   18 202;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L3:
        char c1;
        eev.c("Babel", (new StringBuilder(39)).append("keyCode is not a dtmf code: ").append(i).toString());
        c1 = '\0';
_L16:
        if (c1 != 0)
        {
            b.getText().append(c1);
            bpm bpm1 = a.s();
            if (bpm1 != null)
            {
                if (d == null)
                {
                    bpm1.a(c1);
                    return;
                } else
                {
                    bpm1.a(d, c1);
                    return;
                }
            }
        }
        if (true) goto _L1; else goto _L5
_L5:
        c1 = '1';
          goto _L16
_L6:
        c1 = '2';
          goto _L16
_L7:
        c1 = '3';
          goto _L16
_L8:
        c1 = '4';
          goto _L16
_L9:
        c1 = '5';
          goto _L16
_L10:
        c1 = '6';
          goto _L16
_L11:
        c1 = '7';
          goto _L16
_L12:
        c1 = '8';
          goto _L16
_L13:
        c1 = '9';
          goto _L16
_L4:
        c1 = '0';
          goto _L16
_L15:
        c1 = '#';
          goto _L16
_L14:
        c1 = '*';
          goto _L16
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(g.gp, viewgroup, false);
        b = (EditText)layoutinflater.findViewById(h.cK);
        c = (DialpadFragment)getChildFragmentManager().a(h.aN);
        c.a(this);
        d = getActivity().getIntent().getStringExtra("extra_endpoint_jid");
        viewgroup = a.s();
        if (viewgroup != null)
        {
            b.setText(viewgroup.O());
        }
        return layoutinflater;
    }
}
