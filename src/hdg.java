// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class hdg extends hmm
    implements hbc
{

    hbi a;
    gqz b;
    hbk c;

    public hdg()
    {
    }

    public void a(hbo hbo)
    {
        boolean flag2 = false;
        boolean flag = false;
        Object obj = getArguments();
        hav hav1;
        ArrayList arraylist;
        Iterator iterator;
        if (obj != null)
        {
            hav1 = (hav)((Bundle) (obj)).getParcelable("account_filter");
        } else
        {
            hav1 = null;
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
            grb grb2 = b.a(j);
            if (c.a(hbo, j) && (hav1 == null || hav1.a(j, grb2)))
            {
                arraylist.add(Integer.valueOf(j));
            }
        } while (true);
        if (arraylist.isEmpty())
        {
            hbo = b.a().iterator();
            do
            {
                if (!hbo.hasNext())
                {
                    break;
                }
                int k = ((Integer)hbo.next()).intValue();
                grb grb1 = b.a(k);
                if ((hav1 == null || hav1.a(k, grb1)) && !grb1.d("is_managed_account"))
                {
                    arraylist.add(Integer.valueOf(k));
                }
            } while (true);
        }
        if (arraylist.isEmpty())
        {
            if (obj == null || ((Bundle) (obj)).getBoolean("add_account"))
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
            hbo = (Integer)arraylist.get(0);
            hbo = b.a(hbo.intValue());
            if (!hbo.d("logged_out") || obj == null || ((Bundle) (obj)).getBoolean("auto_select_single_logged_out_account"))
            {
                a.a(hbo.b("account_name"), hbo.b("effective_gaia_id"));
                return;
            }
        }
        int ai[] = new int[arraylist.size()];
        for (int i = 0; i < arraylist.size(); i++)
        {
            ai[i] = ((Integer)arraylist.get(i)).intValue();
        }

        boolean flag1;
        if (obj != null)
        {
            hbo = ((Bundle) (obj)).getString("dialog_title");
        } else
        {
            hbo = null;
        }
        flag1 = flag2;
        if (obj != null)
        {
            flag1 = flag2;
            if (((Bundle) (obj)).getBoolean("add_account_button_shown"))
            {
                flag1 = true;
            }
        }
        obj = getChildFragmentManager();
        if (hbo == null)
        {
            hbo = context.getString(g.tp);
        }
        hce.a(((ap) (obj)), hbo, ai, flag1);
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        a = (hbi)binder.a(hbi);
        b = (gqz)binder.a(gqz);
        c = (hbk)binder.a(hbk);
    }
}
