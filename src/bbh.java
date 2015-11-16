// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.CursorLoader;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import horizontallistview.HorizontalListView;

public class bbh extends hhu
    implements aur
{

    private static final String b[] = {
        "_id", "media_type", "title", "date_added", "_data"
    };
    private static final int c[];
    private static final String d = "(media_type=1)";
    int a;
    private FloatingActionButton aj;
    private bbd ak;
    private Cursor al;
    private gow e;
    private final gov f = new bbi(this);
    private final gov g = new bbj(this);
    private HorizontalListView h;
    private View i;

    public bbh()
    {
    }

    static hgx a(bbh bbh1)
    {
        return bbh1.binder;
    }

    static hhb b(bbh bbh1)
    {
        return bbh1.context;
    }

    static gow c(bbh bbh1)
    {
        return bbh1.e;
    }

    static hgx d(bbh bbh1)
    {
        return bbh1.binder;
    }

    static hgx e(bbh bbh1)
    {
        return bbh1.binder;
    }

    static hhb f(bbh bbh1)
    {
        return bbh1.context;
    }

    static hgx g(bbh bbh1)
    {
        return bbh1.binder;
    }

    static void h(bbh bbh1)
    {
        ((bdp)bbh1.binder.a(bdp)).a(2325);
        Intent intent = azg.a();
        intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
        bbh1.e.a(g.kq, intent);
    }

    public boolean a()
    {
        if (!g.a(dbf.e(a), apk.f))
        {
            Toast.makeText(context, g.kM, 1).show();
            return false;
        } else
        {
            Object obj = android.provider.MediaStore.Files.getContentUri("external");
            binder.a(aus);
            al = (new CursorLoader(getActivity(), ((android.net.Uri) (obj)), b, d, null, "date_added DESC")).loadInBackground();
            obj = new bba(context, ak, getView(), g.lh, al, b, c);
            h.a(((android.widget.ListAdapter) (obj)));
            h.setOnItemClickListener(((android.widget.AdapterView.OnItemClickListener) (obj)));
            getView().requestLayout();
            return true;
        }
    }

    public void b()
    {
        ak.a();
    }

    public boolean c()
    {
        return true;
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        e = ((gow)binder.a(gow)).a(g.kq, f).a(g.ks, g);
        a = ((gmo)binder.a(gmo)).a();
        ak = new bbd(context);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        i = layoutinflater.inflate(g.lg, viewgroup, false);
        h = (HorizontalListView)i.findViewById(g.lf);
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            h.setLayoutDirection(0);
        }
        aj = (FloatingActionButton)i.findViewById(g.kY);
        aj.setOnClickListener(new bbl(this));
        i.findViewById(g.kZ).bringToFront();
        return i;
    }

    public void onPause()
    {
        super.onPause();
        ak.a();
    }

    public void onStop()
    {
        super.onStop();
        if (al != null)
        {
            al.close();
        }
    }

    static 
    {
        c = (new int[] {
            g.la
        });
    }
}
