// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import adr;
import ads;
import adv;
import adw;
import aea;
import aed;
import aee;
import aef;
import aeh;
import aek;
import ael;
import aeo;
import aep;
import aet;
import aeu;
import aew;
import afb;
import afe;
import aff;
import afg;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.SimpleExpandableListAdapter;
import bhp;
import bmk;
import com.google.android.apps.hangouts.content.EsProvider;
import cpm;
import cpn;
import cpo;
import cpq;
import cpr;
import ebr;
import ebw;
import g;
import gmo;
import gng;
import gz;
import h;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import l;
import po;

public class ViewVCardActivity extends bmk
{

    private static final boolean j = false;
    private final gmo k;
    private boolean m;
    private Uri n;
    private Uri o;
    private List r;
    private List s;
    private ExpandableListView t;
    private Handler u;
    private final android.widget.ExpandableListView.OnChildClickListener v = new cpm(this);

    public ViewVCardActivity()
    {
        k = (new gng(this, q)).a(p);
        r = new ArrayList();
        s = new ArrayList();
        u = new cpr(this);
    }

    public static Uri a(ViewVCardActivity viewvcardactivity, int i1)
    {
        return viewvcardactivity.b(i1);
    }

    public static Uri a(ViewVCardActivity viewvcardactivity, Uri uri)
    {
        viewvcardactivity.o = uri;
        return uri;
    }

    public static void a(ViewVCardActivity viewvcardactivity, ads ads1, List list, List list1)
    {
        Resources resources = viewvcardactivity.getResources();
        Object obj = new gz();
        list.add(obj);
        String s1 = ads1.b();
        list = s1;
        if (s1 == null)
        {
            ads1.a();
            list = ads1.b();
        }
        ((gz) (obj)).put("data", list);
        list = String.valueOf(list);
        if (list.length() != 0)
        {
            list = "name: ".concat(list);
        } else
        {
            list = new String("name: ");
        }
        b(list);
        obj = new ArrayList();
        list = ads1.a;
        if (list != null)
        {
            Iterator iterator = list.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                aef aef1 = (aef)iterator.next();
                list = String.valueOf(aef1.b());
                gz gz4;
                int i1;
                if (list.length() != 0)
                {
                    list = "phone.data is ".concat(list);
                } else
                {
                    list = new String("phone.data is ");
                }
                b(list);
                i1 = aef1.c();
                b((new StringBuilder(25)).append("phone.type is ").append(i1).toString());
                list = String.valueOf(aef1.d());
                if (list.length() != 0)
                {
                    list = "phone.label is ".concat(list);
                } else
                {
                    list = new String("phone.label is ");
                }
                b(list);
                gz4 = new gz();
                ((List) (obj)).add(gz4);
                gz4.put("data", aef1.b());
                try
                {
                    list = android.provider.ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources, aef1.c(), aef1.d()).toString();
                }
                // Misplaced declaration of an exception variable
                catch (List list)
                {
                    list = String.valueOf(list);
                    b((new StringBuilder(String.valueOf(list).length() + 36)).append("createContactItem NotFoundException:").append(list).toString());
                    list = resources.getStringArray(0x1070003)[6];
                }
                // Misplaced declaration of an exception variable
                catch (List list)
                {
                    list = String.valueOf(list);
                    b((new StringBuilder(String.valueOf(list).length() + 34)).append("createContactItem phone Exception:").append(list).toString());
                    list = resources.getStringArray(0x1070003)[6];
                }
                gz4.put("type", list);
            } while (true);
        }
        list = ads1.b;
        if (list != null)
        {
            Iterator iterator1 = list.iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                adw adw1 = (adw)iterator1.next();
                list = String.valueOf(adw1.d());
                gz gz6;
                if (list.length() != 0)
                {
                    list = "email.type is ".concat(list);
                } else
                {
                    list = new String("email.type is ");
                }
                b(list);
                list = String.valueOf(adw1.b());
                if (list.length() != 0)
                {
                    list = "email.data is ".concat(list);
                } else
                {
                    list = new String("email.data is ");
                }
                b(list);
                list = String.valueOf(adw1.d());
                if (list.length() != 0)
                {
                    list = "email.auxdata is ".concat(list);
                } else
                {
                    list = new String("email.auxdata is ");
                }
                b(list);
                gz6 = new gz();
                ((List) (obj)).add(gz6);
                gz6.put("data", adw1.b());
                try
                {
                    list = android.provider.ContactsContract.CommonDataKinds.Email.getTypeLabel(resources, adw1.c(), adw1.d()).toString();
                }
                // Misplaced declaration of an exception variable
                catch (List list)
                {
                    list = resources.getStringArray(0x1070000)[2];
                }
                // Misplaced declaration of an exception variable
                catch (List list)
                {
                    list = String.valueOf(list);
                    b((new StringBuilder(String.valueOf(list).length() + 34)).append("createContactItem email Exception:").append(list).toString());
                    list = resources.getStringArray(0x1070000)[2];
                }
                gz6.put("type", list);
            } while (true);
        }
        list = ads1.c;
        if (list != null)
        {
            Iterator iterator2 = list.iterator();
            do
            {
                if (!iterator2.hasNext())
                {
                    break;
                }
                aeh aeh1 = (aeh)iterator2.next();
                int j1 = aeh1.i();
                b((new StringBuilder(26)).append("Postal.type is ").append(j1).toString());
                list = String.valueOf(aeh1.h());
                gz gz7;
                String s4;
                if (list.length() != 0)
                {
                    list = "Postal.data is ".concat(list);
                } else
                {
                    list = new String("Postal.data is ");
                }
                b(list);
                list = String.valueOf(aeh1.j());
                if (list.length() != 0)
                {
                    list = "Postal.auxdata is ".concat(list);
                } else
                {
                    list = new String("Postal.auxdata is ");
                }
                b(list);
                gz7 = new gz();
                ((List) (obj)).add(gz7);
                list = new StringBuilder();
                s4 = aeh1.b();
                if (!TextUtils.isEmpty(s4))
                {
                    list.append(s4).append(" ");
                }
                s4 = aeh1.c();
                if (!TextUtils.isEmpty(s4))
                {
                    list.append(s4).append(" ");
                }
                s4 = aeh1.d();
                if (!TextUtils.isEmpty(s4))
                {
                    list.append(s4).append(" ");
                }
                s4 = aeh1.e();
                if (!TextUtils.isEmpty(s4))
                {
                    list.append(s4).append(" ");
                }
                s4 = aeh1.f();
                if (!TextUtils.isEmpty(s4))
                {
                    list.append(s4).append(" ");
                }
                s4 = aeh1.g();
                if (!TextUtils.isEmpty(s4))
                {
                    list.append(s4).append(" ");
                }
                s4 = aeh1.h();
                if (!TextUtils.isEmpty(s4))
                {
                    list.append(s4);
                }
                gz7.put("data", list.toString());
                try
                {
                    list = resources.getStringArray(0x1070004)[aeh1.i() - 1];
                }
                // Misplaced declaration of an exception variable
                catch (List list)
                {
                    list = resources.getStringArray(0x1070004)[2];
                }
                // Misplaced declaration of an exception variable
                catch (List list)
                {
                    list = String.valueOf(list);
                    b((new StringBuilder(String.valueOf(list).length() + 35)).append("createContactItem postal Exception:").append(list).toString());
                    list = resources.getStringArray(0x1070004)[2];
                }
                gz7.put("type", list);
            } while (true);
        }
        list = ads1.e;
        if (list != null)
        {
            Iterator iterator3 = list.iterator();
            do
            {
                if (!iterator3.hasNext())
                {
                    break;
                }
                aea aea1 = (aea)iterator3.next();
                int k1 = aea1.c();
                b((new StringBuilder(22)).append("im.type is ").append(k1).toString());
                list = String.valueOf(aea1.b());
                gz gz5;
                if (list.length() != 0)
                {
                    list = "im.data is ".concat(list);
                } else
                {
                    list = new String("im.data is ");
                }
                b(list);
                gz5 = new gz();
                ((List) (obj)).add(gz5);
                gz5.put("data", aea1.b());
                try
                {
                    list = resources.getString(android.provider.ContactsContract.CommonDataKinds.Im.getProtocolLabelResource(aea1.c()));
                }
                // Misplaced declaration of an exception variable
                catch (List list)
                {
                    list = viewvcardactivity.getString(l.hU);
                }
                // Misplaced declaration of an exception variable
                catch (List list)
                {
                    list = String.valueOf(list);
                    b((new StringBuilder(String.valueOf(list).length() + 31)).append("createContactItem IM Exception:").append(list).toString());
                    list = viewvcardactivity.getString(l.hU);
                }
                gz5.put("type", list);
            } while (true);
        }
        list = ads1.d;
        if (list != null)
        {
            Iterator iterator4 = list.iterator();
            do
            {
                if (!iterator4.hasNext())
                {
                    break;
                }
                aee aee1 = (aee)iterator4.next();
                list = String.valueOf(aee1.c());
                String s2;
                gz gz8;
                String s5;
                int l1;
                if (list.length() != 0)
                {
                    list = "Organization.Organization is ".concat(list);
                } else
                {
                    list = new String("Organization.Organization is ");
                }
                b(list);
                l1 = aee1.e();
                b((new StringBuilder(32)).append("Organization.type is ").append(l1).toString());
                gz8 = new gz();
                ((List) (obj)).add(gz8);
                s2 = aee1.d();
                l1 = l.tm;
                s5 = aee1.c();
                list = s2;
                if (s2 == null)
                {
                    list = "";
                }
                gz8.put("data", resources.getString(l1, new Object[] {
                    s5, list
                }));
                try
                {
                    list = resources.getString(android.provider.ContactsContract.CommonDataKinds.Organization.getTypeLabelResource(aee1.e()));
                }
                // Misplaced declaration of an exception variable
                catch (List list)
                {
                    list = resources.getStringArray(0x1070002)[1];
                }
                // Misplaced declaration of an exception variable
                catch (List list)
                {
                    list = String.valueOf(list);
                    b((new StringBuilder(String.valueOf(list).length() + 41)).append("createContactItem Organization Exception:").append(list).toString());
                    list = resources.getStringArray(0x1070002)[1];
                }
                gz8.put("type", list);
            } while (true);
        }
        list = ads1.f;
        if (list != null)
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                aek aek1 = (aek)list.next();
                String s3 = String.valueOf(aek1);
                b((new StringBuilder(String.valueOf(s3).length() + 11)).append("website is ").append(s3).toString());
                if (aek1 != null && TextUtils.isGraphic(aek1.b()))
                {
                    gz gz3 = new gz();
                    ((List) (obj)).add(gz3);
                    gz3.put("data", aek1.b());
                    gz3.put("type", viewvcardactivity.getString(l.tV));
                }
            } while (true);
        }
        if (ads1.h != null)
        {
            list = ads1.h.a;
        } else
        {
            list = null;
        }
        if (list != null)
        {
            gz gz1 = new gz();
            if (TextUtils.isGraphic(list))
            {
                ((List) (obj)).add(gz1);
                gz1.put("data", list);
                gz1.put("type", viewvcardactivity.getString(l.cd));
            }
        }
        ads1 = ads1.g;
        if (ads1 != null)
        {
            ads1 = ads1.iterator();
            do
            {
                if (!ads1.hasNext())
                {
                    break;
                }
                list = (aed)ads1.next();
                if (TextUtils.isGraphic(list.b()))
                {
                    gz gz2 = new gz();
                    ((List) (obj)).add(gz2);
                    gz2.put("data", list.b());
                    gz2.put("type", viewvcardactivity.getString(l.ft));
                }
            } while (true);
        }
        list1.add(obj);
    }

    public static void a(ViewVCardActivity viewvcardactivity, Uri uri, aew aew1)
    {
        int j1 = aew1.c();
        int i1 = j1;
        if (j1 == 0)
        {
            i1 = adr.a(viewvcardactivity.getString(l.am));
        }
        aew1 = new ael(i1);
        aew1.a(new cpq(viewvcardactivity, viewvcardactivity.u));
        try
        {
            viewvcardactivity.a(uri, i1, ((aeo) (aew1)), false, ((List) (null)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ViewVCardActivity viewvcardactivity)
        {
            Log.e("Babel", "Never reach here.");
        }
    }

    public static void a(String s1)
    {
        b(s1);
    }

    private boolean a(Uri uri, int i1, aeo aeo, boolean flag, List list)
    {
        ContentResolver contentresolver = getContentResolver();
        Object obj;
        aet aet1;
        obj = contentresolver.openInputStream(uri);
        aet1 = new aet((byte)0);
        aet1.a(aeo);
        list = ((List) (obj));
        aet1.a(((InputStream) (obj)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        ((InputStream) (obj)).close();
_L5:
        return true;
        uri;
        Log.e("Babel", "", uri);
        continue; /* Loop/switch isn't completed */
        list;
        list = ((List) (obj));
        ((InputStream) (obj)).close();
_L2:
        list = ((List) (obj));
        if (!(aeo instanceof ael))
        {
            break MISSING_BLOCK_LABEL_135;
        }
        list = ((List) (obj));
        ((ael)aeo).c();
        list = ((List) (obj));
        uri = contentresolver.openInputStream(uri);
        list = uri;
        obj = new aeu(i1);
        list = uri;
        ((aep) (obj)).a(aeo);
        list = uri;
        ((aep) (obj)).a(uri);
        if (uri == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        IOException ioexception;
        try
        {
            uri.close();
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri) { }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            if ((uri instanceof afe) && flag)
            {
                throw (afe)uri;
            }
            break; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return false;
        }
        Log.e("Babel", "", uri);
        continue; /* Loop/switch isn't completed */
        ioexception;
        list = ((List) (obj));
        Log.e("Babel", "", ioexception);
        if (true) goto _L2; else goto _L1
        uri;
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_253;
        }
        list.close();
_L3:
        try
        {
            throw uri;
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            uri = String.valueOf(uri.getMessage());
            if (uri.length() != 0)
            {
                uri = "IOException was emitted: ".concat(uri);
            } else
            {
                uri = new String("IOException was emitted: ");
            }
            Log.e("Babel", uri);
            return false;
        }
        aeo;
        list = uri;
        throw new afb("vCard with unspported version.");
        aeo;
        Log.e("Babel", "", aeo);
          goto _L3
_L1:
        return false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static boolean a(ViewVCardActivity viewvcardactivity)
    {
        return viewvcardactivity.m;
    }

    public static boolean a(ViewVCardActivity viewvcardactivity, Uri uri, int i1, aeo aeo, boolean flag)
    {
        return viewvcardactivity.a(uri, i1, aeo, flag, ((List) (null)));
    }

    private Uri b(int i1)
    {
        Object obj1;
        Object obj4;
        obj4 = EsProvider.a(i1, Math.abs(bhp.f.nextLong()));
        Object obj;
        Object obj2;
        Object obj3;
        byte abyte0[];
        try
        {
            obj1 = getContentResolver();
            obj = ((ContentResolver) (obj1)).openOutputStream(((Uri) (obj4)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj4)
        {
            obj = null;
            obj1 = null;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj = null;
            obj2 = null;
        }
        obj1 = ((ContentResolver) (obj1)).openInputStream(n);
        obj3 = obj;
        obj2 = obj1;
        abyte0 = new byte[1024];
_L2:
        obj3 = obj;
        obj2 = obj1;
        i1 = ((InputStream) (obj1)).read(abyte0, 0, 1024);
        if (i1 == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj3 = obj;
        obj2 = obj1;
        ((OutputStream) (obj)).write(abyte0, 0, i1);
        if (true) goto _L2; else goto _L1
        obj4;
_L6:
        obj3 = obj;
        obj2 = obj1;
        ebw.e("Babel", "IOException saving location image", ((Throwable) (obj4)));
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                ebw.e("Babel", "IOException caught while closing stream", ((Throwable) (obj1)));
            }
        }
        if (obj != null)
        {
            try
            {
                ((OutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ebw.e("Babel", "IOException caught while closing stream", ((Throwable) (obj)));
            }
        }
        obj1 = null;
        return ((Uri) (obj1));
_L1:
        obj3 = obj;
        obj2 = obj1;
        ((OutputStream) (obj)).flush();
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                ebw.e("Babel", "IOException caught while closing stream", ((Throwable) (obj1)));
            }
        }
        obj1 = obj4;
        if (obj != null)
        {
            try
            {
                ((OutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ebw.e("Babel", "IOException caught while closing stream", ((Throwable) (obj)));
                return ((Uri) (obj4));
            }
            return ((Uri) (obj4));
        } else
        {
            break MISSING_BLOCK_LABEL_125;
        }
_L4:
        if (obj2 != null)
        {
            try
            {
                ((InputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2)
            {
                ebw.e("Babel", "IOException caught while closing stream", ((Throwable) (obj2)));
            }
        }
        if (obj != null)
        {
            try
            {
                ((OutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ebw.e("Babel", "IOException caught while closing stream", ((Throwable) (obj)));
            }
        }
        throw obj1;
        obj1;
        obj2 = null;
        continue; /* Loop/switch isn't completed */
        obj1;
        obj = obj3;
        if (true) goto _L4; else goto _L3
_L3:
        break MISSING_BLOCK_LABEL_27;
        obj4;
        obj1 = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static gmo b(ViewVCardActivity viewvcardactivity)
    {
        return viewvcardactivity.k;
    }

    private static void b(String s1)
    {
        if (j)
        {
            s1 = String.valueOf(s1);
            if (s1.length() != 0)
            {
                s1 = "[ViewVCardActivity]: ".concat(s1);
            } else
            {
                s1 = new String("[ViewVCardActivity]: ");
            }
            ebw.b("Babel", s1);
        }
    }

    public static Uri c(ViewVCardActivity viewvcardactivity)
    {
        return viewvcardactivity.o;
    }

    public static void d(ViewVCardActivity viewvcardactivity)
    {
        viewvcardactivity.j();
    }

    public static Handler e(ViewVCardActivity viewvcardactivity)
    {
        return viewvcardactivity.u;
    }

    public static boolean f(ViewVCardActivity viewvcardactivity)
    {
        viewvcardactivity.m = true;
        return true;
    }

    public static List g(ViewVCardActivity viewvcardactivity)
    {
        return viewvcardactivity.r;
    }

    public static List h(ViewVCardActivity viewvcardactivity)
    {
        return viewvcardactivity.s;
    }

    public static void i(ViewVCardActivity viewvcardactivity)
    {
        ExpandableListView expandablelistview = viewvcardactivity.t;
        List list = viewvcardactivity.r;
        int i1 = g.hm;
        List list1 = viewvcardactivity.s;
        int j1 = g.hn;
        expandablelistview.setAdapter(new SimpleExpandableListAdapter(viewvcardactivity, list, i1, new String[] {
            "data"
        }, new int[] {
            0x1020014
        }, list1, j1, new String[] {
            "type", "data"
        }, new int[] {
            0x1020014, 0x1020015
        }));
        viewvcardactivity.t.setFocusable(true);
        viewvcardactivity.t.getEmptyView().setVisibility(8);
        viewvcardactivity.t.setVisibility(0);
    }

    private void j()
    {
        ebr.b(this, getString(l.tx));
        finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.hl);
        bundle = findViewById(h.br);
        t = (ExpandableListView)findViewById(h._flddo);
        t.setEmptyView(bundle);
        t.setFocusable(true);
        t.setOnChildClickListener(v);
        bundle = getIntent();
        String s1 = String.valueOf(bundle);
        b((new StringBuilder(String.valueOf(s1).length() + 10)).append("intent is ").append(s1).toString());
        n = bundle.getData();
        if (n == null)
        {
            break MISSING_BLOCK_LABEL_236;
        }
        bundle = String.valueOf(n.toString());
        if (bundle.length() == 0) goto _L2; else goto _L1
_L1:
        bundle = "mUri is ".concat(bundle);
_L3:
        b(bundle);
        (new Thread(new cpo(this, n))).start();
_L4:
        g().a(true);
        return;
_L2:
        bundle = new String("mUri is ");
          goto _L3
        try
        {
            j();
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle = String.valueOf(bundle);
            b((new StringBuilder(String.valueOf(bundle).length() + 19)).append("onCreate Exception ").append(bundle).toString());
        }
          goto _L4
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.add(0, 0, 0, l.fd).setShowAsAction(1);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0)
        {
            menuitem = String.valueOf(n);
            b((new StringBuilder(String.valueOf(menuitem).length() + 12)).append("save vcard: ").append(menuitem).toString());
            if (n != null && k.b())
            {
                (new cpn(this)).execute(new Uri[] {
                    o
                });
            }
        } else
        if (menuitem.getItemId() == 0x102002c)
        {
            onBackPressed();
            return true;
        }
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        super.onPrepareOptionsMenu(menu);
        if (m)
        {
            menu.findItem(0).setVisible(true);
            return true;
        } else
        {
            menu.findItem(0).setVisible(false);
            return true;
        }
    }

    static 
    {
        hik hik = ebw.j;
    }
}
