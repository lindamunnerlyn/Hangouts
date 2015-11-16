// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import adt;
import adu;
import adx;
import ady;
import aec;
import aef;
import aeg;
import aeh;
import aej;
import aem;
import aen;
import aeq;
import aer;
import aev;
import aew;
import aey;
import afd;
import afg;
import afh;
import afi;
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
import android.widget.Toast;
import bib;
import bmr;
import com.google.android.apps.hangouts.content.EsProvider;
import crd;
import cre;
import crf;
import crh;
import cri;
import eev;
import g;
import gqu;
import grn;
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
import pq;

public class ViewVCardActivity extends bmr
{

    private static final boolean j = false;
    private final gqu k;
    private boolean l;
    private Uri n;
    private Uri o;
    private List p;
    private List s;
    private ExpandableListView t;
    private Handler u;
    private final android.widget.ExpandableListView.OnChildClickListener v = new crd(this);

    public ViewVCardActivity()
    {
        k = (new grn(this, r)).a(q);
        p = new ArrayList();
        s = new ArrayList();
        u = new cri(this);
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

    public static void a(ViewVCardActivity viewvcardactivity, adu adu1, List list, List list1)
    {
        Resources resources = viewvcardactivity.getResources();
        Object obj = new gz();
        list.add(obj);
        String s1 = adu1.b();
        list = s1;
        if (s1 == null)
        {
            adu1.a();
            list = adu1.b();
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
        list = adu1.a;
        if (list != null)
        {
            Iterator iterator = list.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                aeh aeh1 = (aeh)iterator.next();
                list = String.valueOf(aeh1.b());
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
                i1 = aeh1.c();
                b((new StringBuilder(25)).append("phone.type is ").append(i1).toString());
                list = String.valueOf(aeh1.d());
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
                gz4.put("data", aeh1.b());
                try
                {
                    list = android.provider.ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources, aeh1.c(), aeh1.d()).toString();
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
        list = adu1.b;
        if (list != null)
        {
            Iterator iterator1 = list.iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                ady ady1 = (ady)iterator1.next();
                list = String.valueOf(ady1.d());
                gz gz6;
                if (list.length() != 0)
                {
                    list = "email.type is ".concat(list);
                } else
                {
                    list = new String("email.type is ");
                }
                b(list);
                list = String.valueOf(ady1.b());
                if (list.length() != 0)
                {
                    list = "email.data is ".concat(list);
                } else
                {
                    list = new String("email.data is ");
                }
                b(list);
                list = String.valueOf(ady1.d());
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
                gz6.put("data", ady1.b());
                try
                {
                    list = android.provider.ContactsContract.CommonDataKinds.Email.getTypeLabel(resources, ady1.c(), ady1.d()).toString();
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
        list = adu1.c;
        if (list != null)
        {
            Iterator iterator2 = list.iterator();
            do
            {
                if (!iterator2.hasNext())
                {
                    break;
                }
                aej aej1 = (aej)iterator2.next();
                int j1 = aej1.i();
                b((new StringBuilder(26)).append("Postal.type is ").append(j1).toString());
                list = String.valueOf(aej1.h());
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
                list = String.valueOf(aej1.j());
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
                s4 = aej1.b();
                if (!TextUtils.isEmpty(s4))
                {
                    list.append(s4).append(" ");
                }
                s4 = aej1.c();
                if (!TextUtils.isEmpty(s4))
                {
                    list.append(s4).append(" ");
                }
                s4 = aej1.d();
                if (!TextUtils.isEmpty(s4))
                {
                    list.append(s4).append(" ");
                }
                s4 = aej1.e();
                if (!TextUtils.isEmpty(s4))
                {
                    list.append(s4).append(" ");
                }
                s4 = aej1.f();
                if (!TextUtils.isEmpty(s4))
                {
                    list.append(s4).append(" ");
                }
                s4 = aej1.g();
                if (!TextUtils.isEmpty(s4))
                {
                    list.append(s4).append(" ");
                }
                s4 = aej1.h();
                if (!TextUtils.isEmpty(s4))
                {
                    list.append(s4);
                }
                gz7.put("data", list.toString());
                try
                {
                    list = resources.getStringArray(0x1070004)[aej1.i() - 1];
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
        list = adu1.e;
        if (list != null)
        {
            Iterator iterator3 = list.iterator();
            do
            {
                if (!iterator3.hasNext())
                {
                    break;
                }
                aec aec1 = (aec)iterator3.next();
                int k1 = aec1.c();
                b((new StringBuilder(22)).append("im.type is ").append(k1).toString());
                list = String.valueOf(aec1.b());
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
                gz5.put("data", aec1.b());
                try
                {
                    list = resources.getString(android.provider.ContactsContract.CommonDataKinds.Im.getProtocolLabelResource(aec1.c()));
                }
                // Misplaced declaration of an exception variable
                catch (List list)
                {
                    list = viewvcardactivity.getString(l.ho);
                }
                // Misplaced declaration of an exception variable
                catch (List list)
                {
                    list = String.valueOf(list);
                    b((new StringBuilder(String.valueOf(list).length() + 31)).append("createContactItem IM Exception:").append(list).toString());
                    list = viewvcardactivity.getString(l.ho);
                }
                gz5.put("type", list);
            } while (true);
        }
        list = adu1.d;
        if (list != null)
        {
            Iterator iterator4 = list.iterator();
            do
            {
                if (!iterator4.hasNext())
                {
                    break;
                }
                aeg aeg1 = (aeg)iterator4.next();
                list = String.valueOf(aeg1.c());
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
                l1 = aeg1.e();
                b((new StringBuilder(32)).append("Organization.type is ").append(l1).toString());
                gz8 = new gz();
                ((List) (obj)).add(gz8);
                s2 = aeg1.d();
                l1 = l.sE;
                s5 = aeg1.c();
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
                    list = resources.getString(android.provider.ContactsContract.CommonDataKinds.Organization.getTypeLabelResource(aeg1.e()));
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
        list = adu1.f;
        if (list != null)
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                aem aem1 = (aem)list.next();
                String s3 = String.valueOf(aem1);
                b((new StringBuilder(String.valueOf(s3).length() + 11)).append("website is ").append(s3).toString());
                if (aem1 != null && TextUtils.isGraphic(aem1.b()))
                {
                    gz gz3 = new gz();
                    ((List) (obj)).add(gz3);
                    gz3.put("data", aem1.b());
                    gz3.put("type", viewvcardactivity.getString(l.tm));
                }
            } while (true);
        }
        if (adu1.h != null)
        {
            list = adu1.h.a;
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
                gz1.put("type", viewvcardactivity.getString(l.bY));
            }
        }
        adu1 = adu1.g;
        if (adu1 != null)
        {
            adu1 = adu1.iterator();
            do
            {
                if (!adu1.hasNext())
                {
                    break;
                }
                list = (aef)adu1.next();
                if (TextUtils.isGraphic(list.b()))
                {
                    gz gz2 = new gz();
                    ((List) (obj)).add(gz2);
                    gz2.put("data", list.b());
                    gz2.put("type", viewvcardactivity.getString(l.fc));
                }
            } while (true);
        }
        list1.add(obj);
    }

    public static void a(ViewVCardActivity viewvcardactivity, Uri uri, aey aey1)
    {
        int j1 = aey1.c();
        int i1 = j1;
        if (j1 == 0)
        {
            i1 = adt.a(viewvcardactivity.getString(l.ai));
        }
        aey1 = new aen(i1);
        aey1.a(new crh(viewvcardactivity, viewvcardactivity.u));
        try
        {
            viewvcardactivity.a(uri, i1, ((aeq) (aey1)), false, ((List) (null)));
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

    private boolean a(Uri uri, int i1, aeq aeq, boolean flag, List list)
    {
        ContentResolver contentresolver = getContentResolver();
        Object obj;
        aev aev1;
        obj = contentresolver.openInputStream(uri);
        aev1 = new aev((byte)0);
        aev1.a(aeq);
        list = ((List) (obj));
        aev1.a(((InputStream) (obj)));
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
        if (!(aeq instanceof aen))
        {
            break MISSING_BLOCK_LABEL_135;
        }
        list = ((List) (obj));
        ((aen)aeq).c();
        list = ((List) (obj));
        uri = contentresolver.openInputStream(uri);
        list = uri;
        obj = new aew(i1);
        list = uri;
        ((aer) (obj)).a(aeq);
        list = uri;
        ((aer) (obj)).a(uri);
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
            if ((uri instanceof afg) && flag)
            {
                throw (afg)uri;
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
        aeq;
        list = uri;
        throw new afd("vCard with unspported version.");
        aeq;
        Log.e("Babel", "", aeq);
          goto _L3
_L1:
        return false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static boolean a(ViewVCardActivity viewvcardactivity)
    {
        return viewvcardactivity.l;
    }

    public static boolean a(ViewVCardActivity viewvcardactivity, Uri uri, int i1, aeq aeq, boolean flag)
    {
        return viewvcardactivity.a(uri, i1, aeq, flag, ((List) (null)));
    }

    private Uri b(int i1)
    {
        Object obj1;
        Object obj4;
        obj4 = EsProvider.a(i1, Math.abs(bib.e.nextLong()));
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
        eev.e("Babel", "IOException saving location image", ((Throwable) (obj4)));
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                eev.e("Babel", "IOException caught while closing stream", ((Throwable) (obj1)));
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
                eev.e("Babel", "IOException caught while closing stream", ((Throwable) (obj)));
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
                eev.e("Babel", "IOException caught while closing stream", ((Throwable) (obj1)));
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
                eev.e("Babel", "IOException caught while closing stream", ((Throwable) (obj)));
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
                eev.e("Babel", "IOException caught while closing stream", ((Throwable) (obj2)));
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
                eev.e("Babel", "IOException caught while closing stream", ((Throwable) (obj)));
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

    public static gqu b(ViewVCardActivity viewvcardactivity)
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
            eev.b("Babel", s1);
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
        viewvcardactivity.l = true;
        return true;
    }

    public static List g(ViewVCardActivity viewvcardactivity)
    {
        return viewvcardactivity.p;
    }

    public static List h(ViewVCardActivity viewvcardactivity)
    {
        return viewvcardactivity.s;
    }

    public static void i(ViewVCardActivity viewvcardactivity)
    {
        ExpandableListView expandablelistview = viewvcardactivity.t;
        List list = viewvcardactivity.p;
        int i1 = g.he;
        List list1 = viewvcardactivity.s;
        int j1 = g.hf;
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
        Toast.makeText(this, l.sP, 0).show();
        finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.hd);
        bundle = findViewById(h.bl);
        t = (ExpandableListView)findViewById(h.dc);
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
        (new Thread(new crf(this, n))).start();
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
        menu.add(0, 0, 0, l.eM).setShowAsAction(1);
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
                (new cre(this)).execute(new Uri[] {
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
        if (l)
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
        hnc hnc = eev.j;
    }
}
