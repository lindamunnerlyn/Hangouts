// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class hgz
    implements hon, hot, hov, hoy
{

    private final Activity a;
    private final Set b = new HashSet();
    private SparseArray c;
    private gtx d;

    hgz(Activity activity, hof hof1)
    {
        a = activity;
        hof1.a(this);
    }

    public List a(int i)
    {
        List list1 = d.a(Integer.valueOf(i));
        List list = list1;
        if (list1 == null)
        {
            list = Collections.emptyList();
        }
        return list;
    }

    public void a(int i, String as[], int ai[])
    {
        List list;
        int ai1[];
        int j;
        boolean flag1;
        flag1 = false;
        list = ((hgl)c.get(i)).a();
        c.remove(i);
        ai1 = new int[list.size()];
        j = 0;
_L5:
        if (j >= list.size()) goto _L2; else goto _L1
_L1:
        int k = 0;
_L6:
        if (k >= as.length)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        if (!((String)list.get(j)).equals(as[k])) goto _L4; else goto _L3
_L3:
        k = ai[k];
_L7:
        ai1[j] = k;
        j++;
          goto _L5
_L4:
        k++;
          goto _L6
_L2:
        as = new hgt(i, (String[])list.toArray(new String[list.size()]), ai1);
        ai = b.iterator();
        boolean flag = flag1;
        do
        {
            if (!ai.hasNext())
            {
                break;
            }
            if (((hhc)ai.next()).a(as))
            {
                flag = true;
            }
        } while (true);
        if (!flag)
        {
            d.a(Integer.valueOf(i), as);
        }
        return;
        k = 0;
          goto _L7
    }

    public void a(Bundle bundle)
    {
        if (bundle != null)
        {
            c = bundle.getSparseParcelableArray("com.google.android.libraries.social.permissionmanager.PermissionResultReceiver.Requests");
            d = (gtx)bundle.getParcelable("com.google.android.libraries.social.permissionmanager.PermissionResultReceiver.Results");
        }
        if (c == null)
        {
            c = new SparseArray();
        }
        if (d == null)
        {
            d = new gtx(hgt);
        }
    }

    void a(hgv hgv1, int i, List list)
    {
        c.put(i, new hgl(list));
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            String s = (String)list.next();
            if (hgv1.a(a, s) == -1)
            {
                arraylist.add(s);
            }
        } while (true);
        if (arraylist.isEmpty())
        {
            g.a(new hha(this, i));
            return;
        } else
        {
            list = new String[arraylist.size()];
            arraylist.toArray(list);
            hgv1.a(a, list, i);
            return;
        }
    }

    void a(hhc hhc1)
    {
        b.add(hhc1);
    }

    public void b(Bundle bundle)
    {
        bundle.putSparseParcelableArray("com.google.android.libraries.social.permissionmanager.PermissionResultReceiver.Requests", c);
        bundle.putParcelable("com.google.android.libraries.social.permissionmanager.PermissionResultReceiver.Results", d);
    }

    void b(hhc hhc1)
    {
        b.remove(hhc1);
    }
}
