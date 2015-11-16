// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import android.text.TextUtils;
import android.widget.ExpandableListView;
import android.widget.SimpleExpandableListAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

final class auf extends AsyncTask
{

    final aue a;
    private final List b = new ArrayList();
    private final List c = new ArrayList();

    auf(aue aue1)
    {
        a = aue1;
        super();
    }

    private transient Void a()
    {
        dme dme1;
        aoe aoe1;
        Object obj;
        aoe1 = new aoe(a.a.a, a.a.b.h());
        obj = a.a.d;
        dme1 = dme.a();
        if (!dme1.c()) goto _L2; else goto _L1
_L1:
        if (((ceu) (obj)).b.a == null) goto _L4; else goto _L3
_L3:
        obj = ((ceu) (obj)).b.a;
        a(((String) (obj)), dme1.a(((String) (obj))), aoe1);
_L2:
        dme1.b();
        return null;
_L4:
        if (((ceu) (obj)).c == null) goto _L2; else goto _L5
_L5:
        obj = ((ceu) (obj)).c;
        a(((String) (obj)), aoe1.b(((String) (obj)), dme1), aoe1);
          goto _L2
        Exception exception;
        exception;
        dme1.b();
        throw exception;
    }

    private void a(String s, bhj bhj1, aoe aoe1)
    {
        if (bhj1 == null)
        {
            bhj1 = new gz();
            bhj1.put("text", String.valueOf(s).concat("/ no contacts match"));
            b.add(bhj1);
            s = new ArrayList();
            c.add(s);
            return;
        }
        Object obj = new gz();
        Object obj1 = bhj1.c();
        ((gz) (obj)).put("text", (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(obj1).length())).append(s).append("/").append(((String) (obj1))).toString());
        b.add(obj);
        obj = new ArrayList();
        obj1 = bhj1.f().iterator();
        while (((Iterator) (obj1)).hasNext()) 
        {
            Object obj2 = (bho)((Iterator) (obj1)).next();
            String s1 = ((bho) (obj2)).a;
            String s2 = aoe1.a(null, s1);
            aou aou = aoe1.a(g.m(s1), false, 3);
            Locale locale;
            boolean flag;
            if (TextUtils.equals(a.a.e, s2))
            {
                s = "(INCL)";
            } else
            {
                s = "(EXCL)";
            }
            locale = Locale.US;
            obj2 = ((bho) (obj2)).b;
            if (aou != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(((ArrayList) (obj)), s1, String.format(locale, "    %s\n    computed merge key: %s %s\n    conversation exists? %s", new Object[] {
                obj2, s2, s, Boolean.valueOf(flag)
            }));
        }
        for (s = bhj1.g().iterator(); s.hasNext(); a(((ArrayList) (obj)), "email", ((bhm)s.next()).a)) { }
        a(((ArrayList) (obj)), "qualifiedId", bhj1.b());
        c.add(obj);
    }

    private static void a(ArrayList arraylist, String s, String s1)
    {
        gz gz1 = new gz();
        gz1.put("main", s);
        gz1.put("sub", s1);
        arraylist.add(gz1);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected void onPostExecute(Object obj)
    {
        obj = new android.app.AlertDialog.Builder(a.a.a);
        Object obj1 = a.a.a;
        Object obj2 = b;
        int i = g.fH;
        List list = c;
        int j = g.fI;
        obj1 = new SimpleExpandableListAdapter(((android.content.Context) (obj1)), ((List) (obj2)), i, new String[] {
            "text"
        }, new int[] {
            0x1020014
        }, list, j, new String[] {
            "main", "sub"
        }, new int[] {
            0x1020014, 0x1020015
        });
        obj2 = new ExpandableListView(a.a.a);
        ((ExpandableListView) (obj2)).setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        ((ExpandableListView) (obj2)).setAdapter(((android.widget.ExpandableListAdapter) (obj1)));
        ((android.app.AlertDialog.Builder) (obj)).setView(((android.view.View) (obj2)));
        ((android.app.AlertDialog.Builder) (obj)).show();
    }
}
