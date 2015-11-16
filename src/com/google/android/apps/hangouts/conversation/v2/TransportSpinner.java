// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.conversation.v2;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import ani;
import aoh;
import ark;
import arl;
import bad;
import bae;
import baf;
import bag;
import dbf;
import drw;
import ebd;
import g;
import gmo;
import hgx;
import hiv;
import hjm;
import java.util.Iterator;
import java.util.List;
import l;

public class TransportSpinner extends Spinner
{

    private int a;
    private bag b;
    private drw c;
    private boolean d;
    private String e;
    private boolean f;
    private arl g;
    private List h;
    private boolean i;
    private View j;
    private ark k;
    private ebd l;
    private hgx m;

    public TransportSpinner(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public static View a(TransportSpinner transportspinner)
    {
        return transportspinner.j;
    }

    public static View a(TransportSpinner transportspinner, View view)
    {
        transportspinner.j = view;
        return view;
    }

    public static ark a(TransportSpinner transportspinner, ark ark1)
    {
        transportspinner.k = ark1;
        return ark1;
    }

    public static String a(TransportSpinner transportspinner, int i1)
    {
        if (g.d(i1))
        {
            if (transportspinner.i)
            {
                i1 = l.to;
            } else
            {
                i1 = l.tp;
            }
        } else
        {
            ani ani1 = dbf.e(transportspinner.a);
            if (ani1 != null && ani1.ab())
            {
                i1 = l.tq;
            } else
            {
                i1 = l.tn;
            }
        }
        return transportspinner.getContext().getResources().getString(i1);
    }

    private void a()
    {
        f = true;
        a(h);
    }

    private void a(ark ark1)
    {
_L9:
        int i1;
        int j1;
        j1 = b.getCount();
        i1 = 0;
_L5:
        if (i1 >= j1) goto _L2; else goto _L1
_L1:
        if (getItemAtPosition(i1) != ark1) goto _L4; else goto _L3
_L3:
        setSelection(i1);
_L7:
        return;
_L4:
        i1++;
          goto _L5
_L2:
        if (f || ark1 == null || !h.contains(ark1)) goto _L7; else goto _L6
_L6:
        a();
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static void a(TransportSpinner transportspinner, ImageView imageview)
    {
        int i1;
        if (transportspinner.d)
        {
            i1 = g.hA;
        } else
        {
            i1 = com.google.android.apps.hangouts.R.drawable.bB;
        }
        imageview.setImageResource(i1);
    }

    public static void a(TransportSpinner transportspinner, List list)
    {
        transportspinner.a(list);
    }

    public static void a(TransportSpinner transportspinner, boolean flag)
    {
        if (transportspinner.d != flag)
        {
            transportspinner.d = flag;
            transportspinner.b.notifyDataSetChanged();
            transportspinner.b();
        }
    }

    private void a(List list)
    {
        byte byte0 = 8;
        h = list;
        if (!c.b())
        {
            list = null;
        }
        b.clear();
        if (list != null && !list.isEmpty())
        {
            if (list.size() > 1)
            {
                byte0 = 0;
            }
            setVisibility(byte0);
            Object obj;
            int j1;
            boolean flag2;
            boolean flag10;
            if (list.size() > 1)
            {
                flag10 = true;
            } else
            {
                flag10 = false;
            }
            setEnabled(flag10);
            obj = list.iterator();
            flag2 = false;
            byte0 = 0;
            j1 = 0;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                ark ark2 = (ark)((Iterator) (obj)).next();
                int k1 = ark2.b;
                boolean flag5 = j1;
                if (!TextUtils.isEmpty(ark2.e))
                {
                    boolean flag8;
                    boolean flag9;
                    if (ark2.i != null)
                    {
                        flag5 = true;
                    } else
                    {
                        flag5 = false;
                    }
                    flag5 = j1 | flag5;
                }
                flag8 = byte0 | g.d(k1);
                flag9 = flag2 | g.g(k1);
                flag2 = flag9;
                byte0 = flag8;
                j1 = ((flag5) ? 1 : 0);
                if (e == null)
                {
                    flag2 = flag9;
                    byte0 = flag8;
                    j1 = ((flag5) ? 1 : 0);
                    if (g.f(k1))
                    {
                        e = ark2.a();
                        flag2 = flag9;
                        byte0 = flag8;
                        j1 = ((flag5) ? 1 : 0);
                    }
                }
            } while (true);
            l.a(e);
            obj = b;
            if (byte0 && flag2)
            {
                flag10 = true;
            } else
            {
                flag10 = false;
            }
            bag.a(((bag) (obj)), flag10);
            if (!f && j1)
            {
                Iterator iterator = list.iterator();
                int i1 = 0;
                do
                {
                    j1 = i1;
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    ark ark3 = (ark)iterator.next();
                    boolean flag3;
                    boolean flag6;
                    if (!TextUtils.isEmpty(ark3.e))
                    {
                        j1 = 1;
                    } else
                    {
                        j1 = 0;
                    }
                    if (ark3.i != null)
                    {
                        flag3 = true;
                    } else
                    {
                        flag3 = false;
                    }
                    if (ark3 == k)
                    {
                        flag6 = true;
                    } else
                    {
                        flag6 = false;
                    }
                    if (!flag6 && j1 != 0 && !flag3)
                    {
                        i1++;
                    }
                } while (true);
            } else
            {
                j1 = 0;
            }
            boolean flag;
            if (j1 > 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                ark ark1 = (ark)list.next();
                if (flag)
                {
                    boolean flag1;
                    boolean flag4;
                    boolean flag7;
                    if (!TextUtils.isEmpty(ark1.e))
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    if (ark1.i != null)
                    {
                        flag4 = true;
                    } else
                    {
                        flag4 = false;
                    }
                    if (ark1 == k)
                    {
                        flag7 = true;
                    } else
                    {
                        flag7 = false;
                    }
                    if (!flag7 && flag1 && !flag4)
                    {
                        continue;
                    }
                }
                b.insert(ark1, 0);
            } while (true);
            if (flag)
            {
                b.insert(new bae(this), 0);
            }
            a(k);
            b();
            return;
        } else
        {
            setVisibility(8);
            return;
        }
    }

    private void b()
    {
        Object obj2 = null;
        if (h == null) goto _L2; else goto _L1
_L1:
        Object obj1;
label0:
        {
            Object obj = h.iterator();
            int j1 = 0;
            int i1 = 0;
            while (((Iterator) (obj)).hasNext()) 
            {
                obj1 = (ark)((Iterator) (obj)).next();
                String s;
                Resources resources;
                int k1;
                int i2;
                if (!TextUtils.isEmpty(((ark) (obj1)).e))
                {
                    boolean flag = true;
                    j1 = i1;
                    i1 = ((flag) ? 1 : 0);
                } else
                if (g.f(((ark) (obj1)).b))
                {
                    i1 = j1;
                    j1 = 1;
                } else
                {
                    int l1 = i1;
                    i1 = j1;
                    j1 = l1;
                }
                if (i1 != 0)
                {
                    i2 = i1;
                    k1 = j1;
                    if (j1 != 0)
                    {
                        break label0;
                    }
                }
                k1 = j1;
                j1 = i1;
                i1 = k1;
            }
            k1 = i1;
            i2 = j1;
        }
        resources = getContext().getResources();
        if (k1 != 0 && i2 != 0)
        {
            s = resources.getString(l.sE);
        } else
        {
            s = null;
        }
        if (h != null && !h.isEmpty() && getSelectedItemPosition() < b.getCount())
        {
            obj1 = (ark)getSelectedItem();
        } else
        {
            obj1 = null;
        }
        obj = obj2;
        if (obj1 != null)
        {
            if (!TextUtils.isEmpty(((ark) (obj1)).e))
            {
                obj = resources.getString(l.sD);
            } else
            {
                obj = obj2;
                if (((ark) (obj1)).h != null)
                {
                    obj = ((ark) (obj1)).i;
                    if (obj != null && !TextUtils.isEmpty(((aoh) (obj)).o))
                    {
                        obj = ((aoh) (obj)).o;
                    } else
                    if (!TextUtils.isEmpty(((ark) (obj1)).d))
                    {
                        obj = ((ark) (obj1)).d;
                    } else
                    {
                        obj = resources.getString(l.sA);
                    }
                    if (d)
                    {
                        i1 = l.sC;
                    } else
                    {
                        i1 = l.sF;
                    }
                    obj = resources.getString(i1, new Object[] {
                        obj
                    });
                }
            }
        }
        obj1 = s;
        if (obj != null)
        {
            if (s == null)
            {
                obj1 = obj;
            } else
            {
                obj1 = resources.getString(l.sz, new Object[] {
                    obj, s
                });
            }
        }
_L4:
        setContentDescription(((CharSequence) (obj1)));
        return;
_L2:
        obj1 = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void b(TransportSpinner transportspinner, ark ark1)
    {
        transportspinner.a(ark1);
    }

    public static boolean b(TransportSpinner transportspinner)
    {
        return transportspinner.i;
    }

    public static void c(TransportSpinner transportspinner)
    {
        transportspinner.a();
    }

    public void a(hgx hgx1)
    {
        m = hgx1;
        b = new bag(this, getContext(), g.fu);
        c = (drw)hgx1.a(drw);
        setAdapter(b);
        a = ((gmo)hgx1.a(gmo)).a();
        g = (arl)hgx1.a(arl);
        g.a(new bad(this));
        l = new baf(this, (hjm)hgx1.a(hiv), a);
    }

    public void a(boolean flag)
    {
        if (i == flag)
        {
            return;
        } else
        {
            i = flag;
            b.notifyDataSetChanged();
            return;
        }
    }

    public boolean performClick()
    {
        g.c();
        return super.performClick();
    }

    public void setSelection(int i1)
    {
        Object obj = getItemAtPosition(i1);
        if (obj instanceof ark)
        {
            super.setSelection(i1);
            g.a((ark)obj);
        }
    }
}
