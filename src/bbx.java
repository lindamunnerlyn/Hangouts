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

public class bbx extends hmm
    implements avi
{

    private static final String b[] = {
        "_id", "media_type", "title", "date_added", "_data"
    };
    private static final int c[];
    int a;
    private bbt aj;
    private Cursor ak;
    private gte d;
    private final gtd e = new bby(this);
    private final gtd f = new bbz(this);
    private HorizontalListView g;
    private View h;
    private FloatingActionButton i;

    public bbx()
    {
    }

    static hlp a(bbx bbx1)
    {
        return bbx1.binder;
    }

    static hlt b(bbx bbx1)
    {
        return bbx1.context;
    }

    static gte c(bbx bbx1)
    {
        return bbx1.d;
    }

    static hlp d(bbx bbx1)
    {
        return bbx1.binder;
    }

    static hlp e(bbx bbx1)
    {
        return bbx1.binder;
    }

    static hlt f(bbx bbx1)
    {
        return bbx1.context;
    }

    static hlp g(bbx bbx1)
    {
        return bbx1.binder;
    }

    static void h(bbx bbx1)
    {
        ((beb)bbx1.binder.a(beb)).a(2325);
        Intent intent = azt.a();
        intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
        bbx1.d.a(g.kj, intent);
    }

    public boolean a()
    {
        if (!g.a(dcn.e(a), aqc.f))
        {
            Toast.makeText(context, g.kD, 0).show();
            return false;
        } else
        {
            Object obj = android.provider.MediaStore.Files.getContentUri("external");
            binder.a(avj);
            ak = (new CursorLoader(getActivity(), ((android.net.Uri) (obj)), b, "(media_type=1)", null, "date_added DESC")).loadInBackground();
            obj = new bbq(context, aj, getView(), g.kZ, ak, b, c);
            g.a(((android.widget.ListAdapter) (obj)));
            g.setOnItemClickListener(((android.widget.AdapterView.OnItemClickListener) (obj)));
            getView().requestLayout();
            return true;
        }
    }

    public void b()
    {
        aj.a();
    }

    public boolean c()
    {
        return true;
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        d = ((gte)binder.a(gte)).a(g.kj, e).a(g.kl, f);
        a = ((gqu)binder.a(gqu)).a();
        aj = new bbt(context);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        h = layoutinflater.inflate(g.kY, viewgroup, false);
        g = (HorizontalListView)h.findViewById(g.kX);
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            g.setLayoutDirection(0);
        }
        i = (FloatingActionButton)h.findViewById(g.kQ);
        i.setOnClickListener(new bcb(this));
        h.findViewById(g.kR).bringToFront();
        return h;
    }

    public void onPause()
    {
        super.onPause();
        aj.a();
    }

    public void onStop()
    {
        super.onStop();
        if (ak != null)
        {
            ak.close();
        }
    }

    static 
    {
        c = (new int[] {
            g.kS
        });
    }
}
