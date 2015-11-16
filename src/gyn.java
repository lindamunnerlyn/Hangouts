// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class gyn extends hhu
    implements gws
{

    gwy a;
    gms b;
    gxa c;

    public gyn()
    {
    }

    public void a(gxe gxe)
    {
        ap ap = null;
        boolean flag = false;
        Bundle bundle = getArguments();
        gwl gwl1;
        ArrayList arraylist;
        Iterator iterator;
        if (bundle != null)
        {
            gwl1 = (gwl)bundle.getParcelable("account_filter");
        } else
        {
            gwl1 = null;
        }
        arraylist = new ArrayList();
        iterator = b.a().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            int j = ((Integer)iterator.next()).intValue();
            gmu gmu2 = b.a(j);
            if (c.a(gxe, j) && (gwl1 == null || gwl1.a(j, gmu2)))
            {
                arraylist.add(Integer.valueOf(j));
            }
        } while (true);
        if (arraylist.isEmpty())
        {
            gxe = b.a().iterator();
            do
            {
                if (!gxe.hasNext())
                {
                    break;
                }
                int k = ((Integer)gxe.next()).intValue();
                gmu gmu1 = b.a(k);
                if ((gwl1 == null || gwl1.a(k, gmu1)) && !gmu1.d("is_managed_account"))
                {
                    arraylist.add(Integer.valueOf(k));
                }
            } while (true);
        }
        if (arraylist.isEmpty())
        {
            if (bundle == null || bundle.getBoolean("add_account"))
            {
                flag = true;
            }
            if (flag)
            {
                a.b();
                return;
            } else
            {
                a.c();
                return;
            }
        }
        if (arraylist.size() == 1)
        {
            gxe = (Integer)arraylist.get(0);
            gxe = b.a(gxe.intValue());
            if (!gxe.d("logged_out") || bundle == null || bundle.getBoolean("auto_select_single_logged_out_account"))
            {
                a.a(gxe.b("account_name"), gxe.b("effective_gaia_id"));
                return;
            }
        }
        int ai[] = new int[arraylist.size()];
        for (int i = 0; i < arraylist.size(); i++)
        {
            ai[i] = ((Integer)arraylist.get(i)).intValue();
        }

        gxe = ap;
        if (bundle != null)
        {
            gxe = bundle.getString("dialog_title");
        }
        ap = getChildFragmentManager();
        if (gxe == null)
        {
            gxe = context.getString(g.sO);
        }
        gxt.a(ap, gxe, ai, false);
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        a = (gwy)binder.a(gwy);
        b = (gms)binder.a(gms);
        c = (gxa)binder.a(gxa);
    }
}
