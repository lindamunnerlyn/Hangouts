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

public class bly extends bfw
    implements bgy, br
{

    private bgx aj;
    private bgx ak;
    private ViewGroup al;
    private boolean am;
    private Cursor an;
    private final bma ao = new bma(this);
    private gqu i;

    public bly()
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

    protected void a(int j, bhl bhl)
    {
label0:
        {
            super.a(j, bhl);
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
                cursor = new aro(cursor);
                if (aj != null)
                {
                    cursor.a(aj);
                }
                a(0, ((bhl) (cursor)));
            }
        }
    }

    public void a(dph dph, bgx bgx1)
    {
        if (bgx1 != ak)
        {
            eev.g("Babel", "Unexpected contact lookup load state.");
            gdv.a("Should not have two new items.");
        } else
        {
            ak = null;
            if (dph == c && e != null)
            {
                if (aj != null)
                {
                    aj.a();
                }
                aj = bgx1;
                e.a(aj);
                if (b() != null)
                {
                    b().invalidateViews();
                    return;
                }
            }
        }
    }

    public void a(dph dph, fti fti1, ftp ftp)
    {
        super.a(dph, fti1, ftp);
        if (dph == c && e != null)
        {
            ftp = new android.os.Debug.MemoryInfo();
            Debug.getMemoryInfo(ftp);
            if (fti1 != null && ftp.getTotalPss() - fti1.a() / 10 < 4096)
            {
                eev.f("Babel", "Lots of contacts, or low memory, or both, clearing cache.");
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
            ak = new bgx(fti1, dph, this);
            ak.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    protected bhm[] a()
    {
        return (new bhm[] {
            new bhm()
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
        i = (gqu)binder.a(gqu);
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        android.view.ContextMenu.ContextMenuInfo contextmenuinfo = menuitem.getMenuInfo();
        int j = menuitem.getItemId();
        if (contextmenuinfo instanceof android.widget.AdapterView.AdapterContextMenuInfo)
        {
            menuitem = (egm)((android.widget.AdapterView.AdapterContextMenuInfo)contextmenuinfo).targetView;
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
                view = (egm)((android.widget.AdapterView.AdapterContextMenuInfo)contextmenuinfo).targetView;
                if (!view.i() && view.b() != null && !TextUtils.isEmpty(view.b().b()))
                {
                    contextmenu.add(0, 2, 0, l.l);
                }
                contextmenu.add(0, 1, 0, l.fz);
            }
            contextmenu.setHeaderTitle(l.fH);
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
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle, g.gP);
        al = (ViewGroup)layoutinflater.findViewById(h.dd);
        if (f != null)
        {
            f.getViewTreeObserver().addOnGlobalLayoutListener(ao);
        }
        ((TextView)layoutinflater.findViewById(h.ad)).setOnClickListener(new blz(this));
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
        gng.a(f, ao);
    }

    public void onLoadFinished(em em1, Object obj)
    {
        a((Cursor)obj);
    }

    public void onLoaderReset(em em1)
    {
    }
}
