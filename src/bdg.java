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

public final class bdg extends hmm
{

    GridView a;
    String b;
    gqu c;

    public bdg()
    {
    }

    static int a(bdg bdg1)
    {
        if (((ActivityManager)bdg1.context.getSystemService("activity")).getMemoryClass() >= 192)
        {
            return bdg1.getActivity().getResources().getInteger(g.lm);
        } else
        {
            return bdg1.getActivity().getResources().getInteger(g.ln);
        }
    }

    static void a(bdg bdg1, int i)
    {
        long l = 0L;
        eev.c("Babel_Stickers", (new StringBuilder(23)).append("sticker pos=").append(i).toString());
        bdk bdk1 = (bdk)((bdl)bdg1.a.getAdapter()).getItem(i);
        bdg1.a(bdk1.a, "Recent".equals(bdg1.b));
        String s;
        Object obj1;
        if (bdk1.c != null)
        {
            s = String.valueOf(bdk1.c);
            Object obj;
            aua aua1;
            if (s.length() != 0)
            {
                s = "file://".concat(s);
            } else
            {
                s = new String("file://");
            }
        } else
        {
            s = bdk1.b;
        }
        obj = new Intent();
        ((Intent) (obj)).putExtra("album_id", bdg1.b);
        ((Intent) (obj)).putExtra("photo_url", s);
        obj1 = bdk1.a;
        if (obj1 != null)
        {
            l = g.a(Long.valueOf(((String) (obj1))), 0L);
        }
        ((Intent) (obj)).putExtra("picasa_photo_id", l);
        obj = (avj)bdg1.binder.a(avj);
        obj1 = new ArrayList();
        aua1 = new aua();
        aua1.c = atp.d;
        aua1.f = bdg1.b;
        aua1.e = bdk1.a;
        aua1.b = s;
        aua1.a = s;
        aua1.d = edr.b(bdg1.context.getContentResolver(), Uri.parse(s));
        ((List) (obj1)).add(aua1);
        ((avj) (obj)).a(((List) (obj1)));
        ((bcx)bdg1.binder.a(bcx)).a();
    }

    private void a(String s, boolean flag)
    {
        List list = ((bds)getTargetFragment()).a;
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
                cyz cyz1;
                do
                {
                    j = i;
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    cyz1 = (cyz)iterator.next();
                } while ("Recent".equals(cyz1.a));
                Iterator iterator1 = cyz1.e.iterator();
                cza cza1;
                do
                {
                    if (!iterator1.hasNext())
                    {
                        continue label1;
                    }
                    cza1 = (cza)iterator1.next();
                } while (!s.equals(cza1.a));
                i = list.size();
                j = list.indexOf(cyz1);
                i = (cyz1.e.size() - cyz1.e.indexOf(cza1)) + (i - j) * 1000;
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
        eev.g("Babel_Stickers", s);
_L6:
        return;
_L4:
        g.a(dcn.e(((gqu)binder.a(gqu)).a()), 1900, j);
        if (!flag) goto _L6; else goto _L5
_L5:
        g.a(dcn.e(((gqu)binder.a(gqu)).a()), 2240, j);
        return;
_L2:
        j = -1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static hlp b(bdg bdg1)
    {
        return bdg1.binder;
    }

    static hlp c(bdg bdg1)
    {
        return bdg1.binder;
    }

    void a(GridView gridview, ArrayList arraylist)
    {
        if (getActivity() == null || gridview == null)
        {
            return;
        }
        if (gridview.getAdapter() != null)
        {
            ((bdl)gridview.getAdapter()).a();
        }
        if (arraylist != null)
        {
            gridview.setAdapter(new bdl(this, arraylist));
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
        c = (gqu)binder.a(gqu);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        b = getArguments().getString("album_id");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        a = (GridView)layoutinflater.inflate(g.lq, viewgroup, false);
        a(a, ((ArrayList) (null)));
        a.setOnItemClickListener(new bdh(this));
        return a;
    }

    public void onDestroyView()
    {
        eev.e("Babel_Stickers", "Clearing cache.");
        if (a != null && a.getAdapter() != null)
        {
            ((bdl)a.getAdapter()).a();
        }
        super.onDestroyView();
    }

    public void onStart()
    {
        if (!((bds)getTargetFragment()).a.isEmpty())
        {
            (new bdj(this)).execute(new Void[0]);
        } else
        {
            eev.f("Babel_Stickers", "No sticker cache at start.");
        }
        super.onStart();
    }
}
