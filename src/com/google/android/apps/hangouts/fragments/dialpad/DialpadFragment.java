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
import bex;
import bms;
import bmt;
import bmw;
import eep;
import g;
import h;
import hlp;
import l;

// Referenced classes of package com.google.android.apps.hangouts.fragments.dialpad:
//            DialpadKeyButton

public class DialpadFragment extends ad
    implements bmw
{

    private static final int c[][];
    private static final SparseArray d;
    private static final SparseIntArray e;
    private bmt a;
    private bms b;

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

    public void a(bmt bmt1)
    {
        a = bmt1;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        b = new bms(getActivity());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(g.fL, viewgroup, false);
        viewgroup = getResources();
        for (int i = 0; i < c.length; i++)
        {
            bundle = (DialpadKeyButton)layoutinflater.findViewById(c[i][0]);
            TextView textview = (TextView)bundle.findViewById(h.aQ);
            TextView textview1 = (TextView)bundle.findViewById(h.aP);
            eep.a(bundle, true);
            bundle.a(this);
            String s = viewgroup.getString(c[i][1]);
            textview.setText(s);
            bundle.setContentDescription(s);
            textview1.setText(viewgroup.getString(c[i][2]));
            if (c[i][0] == h.gH)
            {
                bundle.a(viewgroup.getString(l.bm));
                textview1.setTextSize(0, viewgroup.getDimension(g.dZ));
            }
            if (c[i][0] == h.fJ || c[i][0] == h.ep)
            {
                textview.setTextColor(getResources().getColor(g.dh));
                textview.setTextSize(0, getResources().getDimension(g.ea));
                textview.setTypeface(Typeface.create(null, 0));
                textview.setPadding(textview.getPaddingLeft(), viewgroup.getDimensionPixelOffset(g.eb), textview.getPaddingRight(), textview.getPaddingBottom());
            }
        }

        if ((bex)hlp.b(getActivity(), bex) != null)
        {
            layoutinflater.setPadding(0, 0, 0, getResources().getDimensionPixelSize(g.eA));
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
        int i = h.gH;
        int j = l.aN;
        int k = l.aM;
        int ai[] = {
            h.dT, l.aP, l.aO
        };
        int ai1[] = {
            h.gu, l.aR, l.aQ
        };
        int i1 = h.gd;
        int j1 = l.aT;
        int k1 = l.aS;
        int l1 = h.bE;
        int i2 = l.aV;
        int j2 = l.aU;
        int k2 = h.br;
        int l2 = l.aX;
        int i3 = l.aW;
        int j3 = h.fC;
        int k3 = l.aZ;
        int l3 = l.aY;
        int i4 = h.fx;
        int j4 = l.bb;
        int k4 = l.ba;
        int ai2[] = {
            h.aZ, l.bd, l.bc
        };
        int l4 = h.dK;
        int i5 = l.bf;
        int j5 = l.be;
        int k5 = h.fJ;
        int l5 = l.bt;
        int i6 = l.bs;
        int j6 = h.ep;
        int k6 = l.bp;
        int l6 = l.bo;
        c = (new int[][] {
            new int[] {
                i, j, k
            }, ai, ai1, new int[] {
                i1, j1, k1
            }, new int[] {
                l1, i2, j2
            }, new int[] {
                k2, l2, i3
            }, new int[] {
                j3, k3, l3
            }, new int[] {
                i4, j4, k4
            }, ai2, new int[] {
                l4, i5, j5
            }, new int[] {
                k5, l5, i6
            }, new int[] {
                j6, k6, l6
            }
        });
        Object obj = new SparseArray();
        d = ((SparseArray) (obj));
        ((SparseArray) (obj)).put(h.dT, Integer.valueOf(8));
        d.put(h.gu, Integer.valueOf(9));
        d.put(h.gd, Integer.valueOf(10));
        d.put(h.bE, Integer.valueOf(11));
        d.put(h.br, Integer.valueOf(12));
        d.put(h.fC, Integer.valueOf(13));
        d.put(h.fx, Integer.valueOf(14));
        d.put(h.aZ, Integer.valueOf(15));
        d.put(h.dK, Integer.valueOf(16));
        d.put(h.gH, Integer.valueOf(7));
        d.put(h.ep, Integer.valueOf(18));
        d.put(h.fJ, Integer.valueOf(17));
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
