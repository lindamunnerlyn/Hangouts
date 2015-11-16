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
import aoz;
import asa;
import asb;
import bas;
import bat;
import bau;
import bav;
import csw;
import dup;
import g;
import gqu;
import hlp;
import hnn;
import hof;
import java.util.Iterator;
import java.util.List;
import l;

public class TransportSpinner extends Spinner
{

    public int a;
    public boolean b;
    public View c;
    public asa d;
    private bav e;
    private dup f;
    private boolean g;
    private String h;
    private boolean i;
    private asb j;
    private List k;
    private csw l;

    public TransportSpinner(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public static void a(TransportSpinner transportspinner, ImageView imageview)
    {
        int i1;
        if (transportspinner.g)
        {
            i1 = g.hs;
        } else
        {
            i1 = com.google.android.apps.hangouts.R.drawable.bx;
        }
        imageview.setImageResource(i1);
    }

    public static void a(TransportSpinner transportspinner, boolean flag)
    {
        if (transportspinner.g != flag)
        {
            transportspinner.g = flag;
            transportspinner.e.notifyDataSetChanged();
            transportspinner.b();
        }
    }

    private void b()
    {
        Object obj2 = null;
        if (k == null) goto _L2; else goto _L1
_L1:
        Object obj1;
label0:
        {
            Object obj = k.iterator();
            int j1 = 0;
            int i1 = 0;
            while (((Iterator) (obj)).hasNext()) 
            {
                obj1 = (asa)((Iterator) (obj)).next();
                String s;
                Resources resources;
                int k1;
                int i2;
                if (!TextUtils.isEmpty(((asa) (obj1)).e))
                {
                    boolean flag = true;
                    j1 = i1;
                    i1 = ((flag) ? 1 : 0);
                } else
                if (g.f(((asa) (obj1)).b))
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
            s = resources.getString(l.rX);
        } else
        {
            s = null;
        }
        if (k != null && !k.isEmpty() && getSelectedItemPosition() < e.getCount())
        {
            obj1 = (asa)getSelectedItem();
        } else
        {
            obj1 = null;
        }
        obj = obj2;
        if (obj1 != null)
        {
            if (!TextUtils.isEmpty(((asa) (obj1)).e))
            {
                obj = resources.getString(l.rW);
            } else
            {
                obj = obj2;
                if (((asa) (obj1)).h != null)
                {
                    obj = ((asa) (obj1)).i;
                    if (obj != null && !TextUtils.isEmpty(((aoz) (obj)).o))
                    {
                        obj = ((aoz) (obj)).o;
                    } else
                    if (!TextUtils.isEmpty(((asa) (obj1)).d))
                    {
                        obj = ((asa) (obj1)).d;
                    } else
                    {
                        obj = resources.getString(l.rT);
                    }
                    if (g)
                    {
                        i1 = l.rV;
                    } else
                    {
                        i1 = l.rY;
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
                obj1 = resources.getString(l.rS, new Object[] {
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

    public void a()
    {
        i = true;
        a(k);
    }

    public void a(asa asa1)
    {
_L9:
        int i1;
        int j1;
        j1 = e.getCount();
        i1 = 0;
_L5:
        if (i1 >= j1) goto _L2; else goto _L1
_L1:
        if (getItemAtPosition(i1) != asa1) goto _L4; else goto _L3
_L3:
        setSelection(i1);
_L7:
        return;
_L4:
        i1++;
          goto _L5
_L2:
        if (i || asa1 == null || !k.contains(asa1)) goto _L7; else goto _L6
_L6:
        a();
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void a(hlp hlp1)
    {
        e = new bav(this, getContext(), g.fs);
        f = (dup)hlp1.a(dup);
        setAdapter(e);
        a = ((gqu)hlp1.a(gqu)).a();
        j = (asb)hlp1.a(asb);
        j.a(new bas(this));
        hlp1 = (hof)hlp1.a(hnn);
        l = new bau(this, getContext(), hlp1, a);
    }

    public void a(List list)
    {
        byte byte0 = 8;
        k = list;
        if (!f.c())
        {
            list = null;
        }
        e.clear();
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
                asa asa2 = (asa)((Iterator) (obj)).next();
                int k1 = asa2.b;
                boolean flag5 = j1;
                if (!TextUtils.isEmpty(asa2.e))
                {
                    boolean flag8;
                    boolean flag9;
                    if (asa2.i != null)
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
                if (h == null)
                {
                    flag2 = flag9;
                    byte0 = flag8;
                    j1 = ((flag5) ? 1 : 0);
                    if (g.f(k1))
                    {
                        h = asa2.a();
                        flag2 = flag9;
                        byte0 = flag8;
                        j1 = ((flag5) ? 1 : 0);
                    }
                }
            } while (true);
            l.a(h);
            obj = e;
            if (byte0 && flag2)
            {
                flag10 = true;
            } else
            {
                flag10 = false;
            }
            obj.a = flag10;
            if (!i && j1)
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
                    asa asa3 = (asa)iterator.next();
                    boolean flag3;
                    boolean flag6;
                    if (!TextUtils.isEmpty(asa3.e))
                    {
                        j1 = 1;
                    } else
                    {
                        j1 = 0;
                    }
                    if (asa3.i != null)
                    {
                        flag3 = true;
                    } else
                    {
                        flag3 = false;
                    }
                    if (asa3 == d)
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
                asa asa1 = (asa)list.next();
                if (flag)
                {
                    boolean flag1;
                    boolean flag4;
                    boolean flag7;
                    if (!TextUtils.isEmpty(asa1.e))
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    if (asa1.i != null)
                    {
                        flag4 = true;
                    } else
                    {
                        flag4 = false;
                    }
                    if (asa1 == d)
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
                e.insert(asa1, 0);
            } while (true);
            if (flag)
            {
                e.insert(new bat(this), 0);
            }
            a(d);
            b();
            return;
        } else
        {
            setVisibility(8);
            return;
        }
    }

    public void a(boolean flag)
    {
        if (b == flag)
        {
            return;
        } else
        {
            b = flag;
            e.notifyDataSetChanged();
            return;
        }
    }

    public boolean performClick()
    {
        j.c();
        return super.performClick();
    }

    public void setSelection(int i1)
    {
        Object obj = getItemAtPosition(i1);
        if (obj instanceof asa)
        {
            super.setSelection(i1);
            j.a((asa)obj);
        }
    }
}
