// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.fragments.dialpad;

import ad;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import beh;
import bml;
import bmm;
import bmp;
import ebr;
import g;
import h;
import hgx;
import l;

// Referenced classes of package com.google.android.apps.hangouts.fragments.dialpad:
//            DialpadKeyButton

public class DialpadFragment extends ad
    implements bmp
{

    private static final int c[][];
    private static final SparseArray d;
    private static final SparseIntArray e;
    private bmm a;
    private bml b;

    public DialpadFragment()
    {
    }

    private static int a(int i)
    {
        return g.a((Integer)d.get(i), -1);
    }

    public void a(View view)
    {
        int i = a(view.getId());
        if (i != -1)
        {
            a.a(i);
            b.c();
        }
    }

    public void a(View view, boolean flag)
    {
label0:
        {
            int i = a(view.getId());
            if (i != -1)
            {
                a.a(i, flag);
                if (!flag)
                {
                    break label0;
                }
                b.a(e.get(i));
                b.d();
            }
            return;
        }
        b.c();
    }

    public void a(bmm bmm1)
    {
        a = bmm1;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        b = new bml(getActivity());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(g.fN, viewgroup, false);
        viewgroup = getResources();
        for (int i = 0; i < c.length; i++)
        {
            bundle = (DialpadKeyButton)layoutinflater.findViewById(c[i][0]);
            TextView textview = (TextView)bundle.findViewById(h.aW);
            TextView textview1 = (TextView)bundle.findViewById(h.aV);
            ebr.a(bundle, true);
            bundle.a(this);
            String s = viewgroup.getString(c[i][1]);
            textview.setText(s);
            bundle.setContentDescription(s);
            textview1.setText(viewgroup.getString(c[i][2]));
            if (c[i][0] == h.hb)
            {
                bundle.a(viewgroup.getString(l.bs));
                textview1.setTextSize(0, viewgroup.getDimension(g.eb));
            }
            if (c[i][0] == h.gb || c[i][0] == h.eH)
            {
                textview.setTextColor(getResources().getColor(g.dj));
                textview.setTextSize(0, getResources().getDimension(g.ec));
                textview.setTypeface(Typeface.create(null, 0));
                textview.setPadding(textview.getPaddingLeft(), viewgroup.getDimensionPixelOffset(g.ed), textview.getPaddingRight(), textview.getPaddingBottom());
            }
        }

        if ((beh)hgx.b(getActivity(), beh) != null)
        {
            layoutinflater.setPadding(0, 0, 0, getResources().getDimensionPixelSize(g.eC));
        }
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
        b.c();
        b.a();
    }

    public void onHiddenChanged(boolean flag)
    {
        super.onHiddenChanged(flag);
        if (flag)
        {
            b.c();
        }
    }

    public void onPause()
    {
        super.onPause();
        b.c();
    }

    public void onResume()
    {
        super.onResume();
        b.b();
    }

    static 
    {
        int i = h.hb;
        int j = l.aT;
        int k = l.aS;
        int ai[] = {
            h.el, l.aV, l.aU
        };
        int ai1[] = {
            h.gM, l.aX, l.aW
        };
        int ai2[] = {
            h.gv, l.aZ, l.aY
        };
        int ai3[] = {
            h.bL, l.bb, l.ba
        };
        int i1 = h.bx;
        int j1 = l.bd;
        int k1 = l.bc;
        int l1 = h.fU;
        int i2 = l.bf;
        int j2 = l.be;
        int k2 = h.fP;
        int l2 = l.bh;
        int i3 = l.bg;
        int j3 = h.bf;
        int k3 = l.bj;
        int l3 = l.bi;
        int i4 = h.dT;
        int j4 = l.bl;
        int k4 = l.bk;
        int ai4[] = {
            h.gb, l.bz, l.by
        };
        int ai5[] = {
            h.eH, l.bv, l.bu
        };
        c = (new int[][] {
            new int[] {
                i, j, k
            }, ai, ai1, ai2, ai3, new int[] {
                i1, j1, k1
            }, new int[] {
                l1, i2, j2
            }, new int[] {
                k2, l2, i3
            }, new int[] {
                j3, k3, l3
            }, new int[] {
                i4, j4, k4
            }, ai4, ai5
        });
        Object obj = new SparseArray();
        d = ((SparseArray) (obj));
        ((SparseArray) (obj)).put(h.el, Integer.valueOf(8));
        d.put(h.gM, Integer.valueOf(9));
        d.put(h.gv, Integer.valueOf(10));
        d.put(h.bL, Integer.valueOf(11));
        d.put(h.bx, Integer.valueOf(12));
        d.put(h.fU, Integer.valueOf(13));
        d.put(h.fP, Integer.valueOf(14));
        d.put(h.bf, Integer.valueOf(15));
        d.put(h.dT, Integer.valueOf(16));
        d.put(h.hb, Integer.valueOf(7));
        d.put(h.eH, Integer.valueOf(18));
        d.put(h.gb, Integer.valueOf(17));
        obj = new SparseIntArray();
        e = ((SparseIntArray) (obj));
        ((SparseIntArray) (obj)).put(8, 1);
        e.put(9, 2);
        e.put(10, 3);
        e.put(11, 4);
        e.put(12, 5);
        e.put(13, 6);
        e.put(14, 7);
        e.put(15, 8);
        e.put(16, 9);
        e.put(7, 0);
        e.put(18, 11);
        e.put(17, 10);
    }
}
