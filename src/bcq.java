// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ActivityManager;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class bcq extends hhu
{

    GridView a;
    String b;
    gmo c;

    public bcq()
    {
    }

    static int a(bcq bcq1)
    {
        if (((ActivityManager)bcq1.context.getSystemService("activity")).getMemoryClass() >= 192)
        {
            return bcq1.getActivity().getResources().getInteger(g.lu);
        } else
        {
            return bcq1.getActivity().getResources().getInteger(g.lv);
        }
    }

    static void a(bcq bcq1, int i)
    {
        long l = 0L;
        ebw.c("Babel_Stickers", (new StringBuilder(23)).append("sticker pos=").append(i).toString());
        bcu bcu1 = (bcu)((bcv)bcq1.a.getAdapter()).getItem(i);
        bcq1.a(bcu1.a, "Recent".equals(bcq1.b));
        String s;
        Object obj1;
        if (bcu1.c != null)
        {
            s = String.valueOf(bcu1.c);
            Object obj;
            atj atj1;
            if (s.length() != 0)
            {
                s = "file://".concat(s);
            } else
            {
                s = new String("file://");
            }
        } else
        {
            s = bcu1.b;
        }
        obj = new Intent();
        ((Intent) (obj)).putExtra("album_id", bcq1.b);
        ((Intent) (obj)).putExtra("photo_url", s);
        obj1 = bcu1.a;
        if (obj1 != null)
        {
            l = g.a(Long.valueOf(((String) (obj1))), 0L);
        }
        ((Intent) (obj)).putExtra("picasa_photo_id", l);
        obj = (aus)bcq1.binder.a(aus);
        obj1 = new ArrayList();
        atj1 = new atj();
        atj1.c = asz.d;
        atj1.f = bcq1.b;
        atj1.e = bcu1.a;
        atj1.b = s;
        atj1.a = s;
        atj1.d = ean.b(bcq1.context.getContentResolver(), Uri.parse(s));
        ((List) (obj1)).add(atj1);
        ((aus) (obj)).a(((List) (obj1)));
        ((bch)bcq1.binder.a(bch)).a();
    }

    private void a(String s, boolean flag)
    {
        List list = ((bdc)getTargetFragment()).a;
        if (list.isEmpty() || s == null) goto _L2; else goto _L1
_L1:
        int j;
label0:
        {
            Iterator iterator = list.iterator();
            int i = -1;
label1:
            do
            {
                cwv cwv1;
                do
                {
                    j = i;
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    cwv1 = (cwv)iterator.next();
                } while ("Recent".equals(cwv1.a));
                Iterator iterator1 = cwv1.e.iterator();
                cww cww1;
                do
                {
                    if (!iterator1.hasNext())
                    {
                        continue label1;
                    }
                    cww1 = (cww)iterator1.next();
                } while (!s.equals(cww1.a));
                i = list.size();
                j = list.indexOf(cwv1);
                i = (cwv1.e.size() - cwv1.e.indexOf(cww1)) + (i - j) * 1000;
            } while (i == -1);
            j = i;
        }
_L8:
        if (j != -1) goto _L4; else goto _L3
_L3:
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "Photo not found for log: ".concat(s);
        } else
        {
            s = new String("Photo not found for log: ");
        }
        ebw.g("Babel_Stickers", s);
_L6:
        return;
_L4:
        g.a(dbf.e(((gmo)binder.a(gmo)).a()), 1900, j);
        if (!flag) goto _L6; else goto _L5
_L5:
        g.a(dbf.e(((gmo)binder.a(gmo)).a()), 2240, j);
        return;
_L2:
        j = -1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static hgx b(bcq bcq1)
    {
        return bcq1.binder;
    }

    static hgx c(bcq bcq1)
    {
        return bcq1.binder;
    }

    void a(GridView gridview, ArrayList arraylist)
    {
        if (getActivity() == null || gridview == null)
        {
            return;
        }
        if (gridview.getAdapter() != null)
        {
            ((bcv)gridview.getAdapter()).a();
        }
        if (arraylist != null)
        {
            gridview.setAdapter(new bcv(this, arraylist));
            return;
        } else
        {
            gridview.setAdapter(null);
            return;
        }
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        c = (gmo)binder.a(gmo);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        b = getArguments().getString("album_id");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        a = (GridView)layoutinflater.inflate(g.ly, viewgroup, false);
        a(a, ((ArrayList) (null)));
        a.setOnItemClickListener(new bcr(this));
        return a;
    }

    public void onDestroyView()
    {
        ebw.e("Babel_Stickers", "Clearing cache.");
        if (a != null && a.getAdapter() != null)
        {
            ((bcv)a.getAdapter()).a();
        }
        super.onDestroyView();
    }

    public void onStart()
    {
        if (!((bdc)getTargetFragment()).a.isEmpty())
        {
            (new bct(this)).execute(new Void[0]);
        } else
        {
            ebw.f("Babel_Stickers", "No sticker cache at start.");
        }
        super.onStart();
    }
}
