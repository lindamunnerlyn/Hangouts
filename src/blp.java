// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Debug;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class blp extends bfk
    implements bgm, br
{

    private bgl aj;
    private bgl ak;
    private ViewGroup al;
    private boolean am;
    private Cursor an;
    private final blr ao = new blr(this);
    private gmo i;

    public blp()
    {
    }

    private void s()
    {
        if (!am)
        {
            return;
        }
        if (ak != null)
        {
            ak.cancel(true);
            ak = null;
        }
        if (!isAdded())
        {
            am = true;
            return;
        }
        em em1 = getLoaderManager().b(1, null, this);
        if (em1 != null)
        {
            em1.u();
        }
        am = false;
    }

    protected void a(int j, bgz bgz)
    {
label0:
        {
            super.a(j, bgz);
            if (e != null)
            {
                if (e.getCount() <= 0)
                {
                    break label0;
                }
                al.setVisibility(0);
            }
            return;
        }
        al.setVisibility(4);
    }

    public void a(Cursor cursor)
    {
        if (!cursor.equals(an))
        {
            an = cursor;
            if (e != null)
            {
                cursor = new aqx(cursor);
                if (aj != null)
                {
                    cursor.a(aj);
                }
                a(0, ((bgz) (cursor)));
            }
        }
    }

    public void a(dmn dmn, bgl bgl1)
    {
        if (bgl1 != ak)
        {
            ebw.g("Babel", "Unexpected contact lookup load state.");
            gbh.a("Should not have two new items.");
        } else
        {
            ak = null;
            if (dmn == c && e != null)
            {
                if (aj != null)
                {
                    aj.a();
                }
                aj = bgl1;
                e.a(aj);
                if (b() != null)
                {
                    b().invalidateViews();
                    return;
                }
            }
        }
    }

    public void a(dmn dmn, fqp fqp1, fqy fqy)
    {
        super.a(dmn, fqp1, fqy);
        if (dmn == c && e != null)
        {
            fqy = new android.os.Debug.MemoryInfo();
            Debug.getMemoryInfo(fqy);
            if (fqp1 != null && fqy.getTotalPss() - fqp1.a() / 10 < 4096)
            {
                ebw.f("Babel", "Lots of contacts, or low memory, or both, clearing cache.");
                if (aj != null)
                {
                    aj.a();
                    aj = null;
                    e.a(null);
                }
            }
            if (ak != null)
            {
                ak.cancel(true);
            }
            ak = new bgl(fqp1, dmn, this);
            ak.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    protected bha[] a()
    {
        return (new bha[] {
            new bha()
        });
    }

    public boolean f()
    {
        if (!super.f())
        {
            return false;
        } else
        {
            am = true;
            s();
            return true;
        }
    }

    protected boolean isEmpty()
    {
        return false;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        s();
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        i = (gmo)binder.a(gmo);
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        android.view.ContextMenu.ContextMenuInfo contextmenuinfo = menuitem.getMenuInfo();
        int j = menuitem.getItemId();
        if (contextmenuinfo instanceof android.widget.AdapterView.AdapterContextMenuInfo)
        {
            menuitem = (edk)((android.widget.AdapterView.AdapterContextMenuInfo)contextmenuinfo).targetView;
            if (j == 1)
            {
                menuitem = menuitem.d();
                if (menuitem != null)
                {
                    RealTimeChatService.a(q(), new String[] {
                        menuitem
                    });
                }
                return true;
            }
            if (j == 2)
            {
                startActivityForResult(g.r(menuitem.b().b()), 102);
                return true;
            }
        }
        return false;
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
        if (view == b())
        {
            if (contextmenuinfo instanceof android.widget.AdapterView.AdapterContextMenuInfo)
            {
                view = (edk)((android.widget.AdapterView.AdapterContextMenuInfo)contextmenuinfo).targetView;
                if (!view.i() && view.b() != null && !TextUtils.isEmpty(view.b().b()))
                {
                    contextmenu.add(0, 2, 0, l.n);
                }
                contextmenu.add(0, 1, 0, l.fQ);
            }
            contextmenu.setHeaderTitle(l.fY);
        }
    }

    public em onCreateLoader(int j, Bundle bundle)
    {
        bundle = q();
        if (j == 1 && bundle != null)
        {
            return g.a(q(), false, 0);
        } else
        {
            return null;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle, g.gX);
        al = (ViewGroup)layoutinflater.findViewById(h.dp);
        if (f != null)
        {
            f.getViewTreeObserver().addOnGlobalLayoutListener(ao);
        }
        ((TextView)layoutinflater.findViewById(h.af)).setOnClickListener(new blq(this));
        registerForContextMenu(b());
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (ak != null)
        {
            ak.cancel(true);
            ak = null;
        }
        if (aj != null)
        {
            aj.a();
            aj = null;
        }
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        gke.a(f, ao);
    }

    public void onLoadFinished(em em1, Object obj)
    {
        a((Cursor)obj);
    }

    public void onLoaderReset(em em1)
    {
    }
}
