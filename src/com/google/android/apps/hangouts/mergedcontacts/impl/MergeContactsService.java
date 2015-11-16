// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.mergedcontacts.impl;

import android.app.IntentService;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.ConditionVariable;
import android.text.TextUtils;
import ani;
import apa;
import apc;
import apd;
import apj;
import bwf;
import bzx;
import cae;
import caf;
import cag;
import cah;
import ceu;
import cey;
import chz;
import com.google.android.apps.hangouts.content.EsProvider;
import csl;
import cwi;
import dac;
import dbf;
import dbq;
import den;
import deo;
import ebj;
import ebr;
import ebw;
import ebx;
import ebz;
import g;
import gam;
import gms;
import gmw;
import gz;
import hgx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MergeContactsService extends IntentService
{

    static final Map a = new cae();
    static final String b[] = {
        "name", "gaia_id", "profile_photo_url"
    };
    private static final String c[] = {
        "lookup", "contact_id", "display_name", "raw_contact_id", "photo_uri", "mimetype", "data1", "data2", "data3", "data4"
    };
    private static final long d;
    private static final long e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    public MergeContactsService()
    {
        super("MergeContactsService");
    }

    private String a(Cursor cursor, String s)
    {
        int k = cursor.getInt(g.a((Integer)a.get("data2"), 0));
        if (k == 0)
        {
            return cursor.getString(g.a((Integer)a.get("data3"), 0));
        }
        if (s.equals("vnd.android.cursor.item/phone_v2"))
        {
            return (String)android.provider.ContactsContract.CommonDataKinds.Phone.getTypeLabel(getApplicationContext().getResources(), k, null);
        }
        if (s.equals("vnd.android.cursor.item/email_v2"))
        {
            return (String)android.provider.ContactsContract.CommonDataKinds.Email.getTypeLabel(getApplicationContext().getResources(), k, null);
        } else
        {
            return "";
        }
    }

    private void a(apd apd1, Collection collection)
    {
        ContentValues contentvalues = new ContentValues();
        ContentValues contentvalues1 = new ContentValues();
        for (collection = collection.iterator(); collection.hasNext(); apd1.d())
        {
            caf caf1 = (caf)collection.next();
            contentvalues.clear();
            contentvalues.put("contact_lookup_key", caf1.b);
            contentvalues.put("contact_id", caf1.c);
            contentvalues.put("raw_contact_id", caf1.d);
            contentvalues.put("display_name", ebz.p(caf1.e));
            contentvalues.put("avatar_url", caf1.f);
            contentvalues.put("is_frequent", Boolean.valueOf(caf1.g));
            long l = apd1.a("merged_contacts", contentvalues);
            f = f + 1;
            Iterator iterator = caf1.h.values().iterator();
            cag cag1;
            boolean flag;
            for (flag = false; iterator.hasNext(); flag = cag1.f | flag)
            {
                cag1 = (cag)iterator.next();
                contentvalues1.clear();
                contentvalues1.put("merged_contact_id", Long.valueOf(l));
                contentvalues1.put("lookup_data_type", Integer.valueOf(0));
                contentvalues1.put("lookup_data", cag1.a);
                contentvalues1.put("lookup_data_display", ebz.p(cag1.a));
                contentvalues1.put("lookup_data_standardized", cag1.b);
                contentvalues1.put("lookup_data_search", cag1.c);
                contentvalues1.put("lookup_data_label", cag1.d);
                contentvalues1.put("is_hangouts_user", Boolean.valueOf(cag1.f));
                contentvalues1.put("gaia_id", cag1.g);
                contentvalues1.put("needs_gaia_ids_resolved", Boolean.valueOf(cag1.e));
                contentvalues1.put("avatar_url", cag1.h);
                contentvalues1.put("display_name", cag1.i);
                contentvalues1.put("last_checked_ts", Long.valueOf(cag1.j));
                apd1.a("merged_contact_details", contentvalues1);
                g = g + 1;
            }

            for (Iterator iterator1 = caf1.i.values().iterator(); iterator1.hasNext();)
            {
                cag cag2 = (cag)iterator1.next();
                contentvalues1.clear();
                contentvalues1.put("merged_contact_id", Long.valueOf(l));
                contentvalues1.put("lookup_data_type", Integer.valueOf(1));
                contentvalues1.put("lookup_data", cag2.a);
                contentvalues1.putNull("lookup_data_display");
                contentvalues1.putNull("lookup_data_standardized");
                contentvalues1.putNull("lookup_data_search");
                contentvalues1.put("lookup_data_label", cag2.d);
                contentvalues1.put("is_hangouts_user", Boolean.valueOf(cag2.f));
                contentvalues1.put("gaia_id", cag2.g);
                contentvalues1.put("needs_gaia_ids_resolved", Boolean.valueOf(cag2.e));
                contentvalues1.put("avatar_url", cag2.h);
                contentvalues1.put("display_name", cag2.i);
                contentvalues1.put("last_checked_ts", Long.valueOf(cag2.j));
                apd1.a("merged_contact_details", contentvalues1);
                h = h + 1;
                flag |= cag2.f;
            }

            if (!TextUtils.isEmpty(caf1.a))
            {
                contentvalues1.clear();
                contentvalues1.put("merged_contact_id", Long.valueOf(l));
                contentvalues1.put("lookup_data_type", Integer.valueOf(2));
                contentvalues1.putNull("lookup_data");
                contentvalues1.putNull("lookup_data_standardized");
                contentvalues1.putNull("lookup_data_search");
                contentvalues1.putNull("lookup_data_label");
                contentvalues1.put("is_hangouts_user", Boolean.valueOf(true));
                contentvalues1.put("needs_gaia_ids_resolved", Boolean.valueOf(false));
                contentvalues1.put("gaia_id", caf1.a);
                contentvalues1.putNull("avatar_url");
                contentvalues1.putNull("display_name");
                contentvalues1.put("last_checked_ts", Integer.valueOf(0));
                apd1.a("merged_contact_details", contentvalues1);
                i = i + 1;
                flag = true;
            }
            if (flag)
            {
                j = j + 1;
            }
        }

    }

    private void a(Map map, int k)
    {
        Object obj = new ArrayList();
        long l = System.currentTimeMillis();
        a(map, ((List) (obj)));
        if (!((List) (obj)).isEmpty())
        {
            boolean flag;
            if (dbq.y(k))
            {
                flag = a(map, ((List) (obj)), k);
            } else
            {
                flag = b(map, ((List) (obj)), k);
            }
            if (flag)
            {
                for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
                {
                    Iterator iterator = ((List)map.get((String)((Iterator) (obj)).next())).iterator();
                    while (iterator.hasNext()) 
                    {
                        ((cag)iterator.next()).j = l;
                    }
                }

            }
        }
    }

    private static void a(Map map, List list)
    {
        long l1 = System.currentTimeMillis();
        Iterator iterator = map.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            boolean flag = false;
            String s1 = null;
            Iterator iterator1 = ((List)entry.getValue()).iterator();
            map = null;
            String s = null;
            cag cag1;
            long l;
            for (l = 0L; iterator1.hasNext(); l = Math.max(l, cag1.j))
            {
                cag1 = (cag)iterator1.next();
                if (cag1.f)
                {
                    flag = true;
                }
                if (!TextUtils.isEmpty(cag1.g))
                {
                    s1 = cag1.g;
                }
                if (!TextUtils.isEmpty(cag1.h))
                {
                    s = cag1.h;
                }
                if (!TextUtils.isEmpty(cag1.i))
                {
                    map = cag1.i;
                }
            }

            boolean flag1 = TextUtils.isEmpty(s1);
            if (((List)entry.getValue()).size() > 1)
            {
                for (Iterator iterator2 = ((List)entry.getValue()).iterator(); iterator2.hasNext();)
                {
                    cag cag2 = (cag)iterator2.next();
                    cag2.f = flag;
                    cag2.g = s1;
                    cag2.h = s;
                    cag2.i = map;
                    cag2.j = l;
                    cag2.e = flag1;
                }

            }
            if (!flag && l1 - l > d)
            {
                list.add(entry.getKey());
            }
        } while (true);
    }

    private void a(Map map, Map map1, Map map2)
    {
        Cursor cursor = getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, c, " contact_id in default_directory AND mimetype IN ('vnd.android.cursor.item/phone_v2','vnd.android.cursor.item/email_v2','vnd.android.cursor.item/photo') AND data_set is null", null, null);
        if (cursor != null) goto _L2; else goto _L1
_L1:
        if (cursor != null)
        {
            cursor.close();
        }
_L11:
        return;
_L2:
        if (!cursor.moveToNext()) goto _L4; else goto _L3
_L3:
        Object obj;
        Object obj1;
        obj = cursor.getString(0);
        obj1 = (caf)map2.get(obj);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        obj1 = new caf(this);
        obj1.b = ((String) (obj));
        map2.put(obj, obj1);
        obj1.c = Long.valueOf(cursor.getLong(1));
        obj1.d = Long.valueOf(cursor.getLong(3));
        obj1.e = cursor.getString(2);
        Object obj3 = cursor.getString(5);
        if (!"vnd.android.cursor.item/photo".equals(obj3)) goto _L6; else goto _L5
_L5:
        obj1.f = cursor.getString(4);
          goto _L2
        map;
_L12:
        if (cursor != null)
        {
            cursor.close();
        }
        throw map;
_L6:
        Object obj2;
        if (!"vnd.android.cursor.item/phone_v2".equals(obj3))
        {
            break MISSING_BLOCK_LABEL_467;
        }
        obj2 = cursor.getString(g.a((Integer)a.get("data1"), 0));
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            break MISSING_BLOCK_LABEL_435;
        }
        obj = cursor.getString(g.a((Integer)a.get("data4"), 0));
_L8:
        String s = a(cursor, ((String) (obj3)));
        String s1 = ebz.h(((String) (obj2)));
        obj3 = new cag(this);
        obj3.a = ((String) (obj2));
        obj3.b = ((String) (obj));
        obj3.c = s1;
        obj3.d = s;
        Object obj4;
        boolean flag;
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj3.e = flag;
        obj4 = ((caf) (obj1)).h;
        if (obj != null)
        {
            obj1 = obj;
        } else
        {
            obj1 = obj2;
        }
        ((Map) (obj4)).put(obj1, obj3);
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L2; else goto _L7
_L7:
        obj2 = (List)map1.get(obj);
        obj1 = obj2;
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_422;
        }
        obj1 = new ArrayList();
        map1.put(obj, obj1);
        ((List) (obj1)).add(obj3);
          goto _L2
        obj = ebz.k(cursor.getString(g.a((Integer)a.get("data1"), 0)));
          goto _L8
        if (!"vnd.android.cursor.item/email_v2".equals(obj3))
        {
            break MISSING_BLOCK_LABEL_613;
        }
        obj4 = cursor.getString(g.a((Integer)a.get("data1"), 0));
        obj2 = (List)map.get(obj4);
        obj = obj2;
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_545;
        }
        obj = new ArrayList();
        map.put(obj4, obj);
        obj2 = a(cursor, ((String) (obj3)));
        obj3 = new cag(this);
        obj3.a = ((String) (obj4));
        obj3.d = ((String) (obj2));
        obj3.e = false;
        ((List) (obj)).add(obj3);
        ((caf) (obj1)).i.put(obj4, obj3);
          goto _L2
        obj = String.valueOf(obj3);
        if (((String) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_649;
        }
        obj = "unexpected mime-type: ".concat(((String) (obj)));
_L9:
        ebw.f("Babel_db", ((String) (obj)));
          goto _L2
        obj = new String("unexpected mime-type: ");
          goto _L9
_L4:
        map = map2.values().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            map1 = (caf)map.next();
            if (((caf) (map1)).h.isEmpty() && ((caf) (map1)).i.isEmpty())
            {
                map.remove();
            }
        } while (true);
        if (cursor == null) goto _L11; else goto _L10
_L10:
        cursor.close();
        return;
        map;
        cursor = null;
          goto _L12
    }

    private static boolean a(Map map, List list, int k)
    {
        list = csl.a(k, 2, null, list);
        if (!list.m())
        {
            list = ((den)list.e()).g.entrySet().iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                Object obj = (java.util.Map.Entry)list.next();
                Object obj1 = (List)map.get(((java.util.Map.Entry) (obj)).getKey());
                if (obj1 != null)
                {
                    obj = (deo)((java.util.Map.Entry) (obj)).getValue();
                    obj1 = ((List) (obj1)).iterator();
                    while (((Iterator) (obj1)).hasNext()) 
                    {
                        cag cag1 = (cag)((Iterator) (obj1)).next();
                        cag1.h = ((deo) (obj)).c;
                        cag1.g = ((deo) (obj)).b;
                        cag1.i = ((deo) (obj)).d;
                        cag1.f = ((deo) (obj)).a;
                    }
                }
            } while (true);
            return true;
        } else
        {
            return false;
        }
    }

    private static void b(Map map, int k)
    {
        long l = System.currentTimeMillis();
        Object obj = new ArrayList();
        a(map, ((List) (obj)));
        if (!((List) (obj)).isEmpty() && dbq.y(k))
        {
            Object obj1 = csl.a(k, 3, Integer.valueOf(2), ((Collection) (obj)));
            if (!((csl) (obj1)).m())
            {
                obj1 = ((den)((csl) (obj1)).e()).g.entrySet().iterator();
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        break;
                    }
                    Object obj2 = (java.util.Map.Entry)((Iterator) (obj1)).next();
                    Object obj3 = (List)map.get(((java.util.Map.Entry) (obj2)).getKey());
                    if (obj3 != null)
                    {
                        obj2 = (deo)((java.util.Map.Entry) (obj2)).getValue();
                        obj3 = ((List) (obj3)).iterator();
                        while (((Iterator) (obj3)).hasNext()) 
                        {
                            cag cag1 = (cag)((Iterator) (obj3)).next();
                            cag1.h = ((deo) (obj2)).c;
                            cag1.i = ((deo) (obj2)).d;
                            cag1.f = ((deo) (obj2)).a;
                        }
                    }
                } while (true);
                for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
                {
                    Iterator iterator = ((List)map.get((String)((Iterator) (obj)).next())).iterator();
                    while (iterator.hasNext()) 
                    {
                        ((cag)iterator.next()).j = l;
                    }
                }

            }
        }
    }

    private boolean b(Map map, List list, int k)
    {
        ConditionVariable conditionvariable = new ConditionVariable();
        cah cah1 = new cah(this, conditionvariable);
        cah1.a(list, k);
        conditionvariable.block();
        list = cah1.a;
        if (list == null)
        {
            return false;
        }
        for (list = list.k().iterator(); list.hasNext();)
        {
            ebj ebj1 = (ebj)list.next();
            ceu aceu[] = (ceu[])ebj1.b;
            int l = aceu.length;
            k = 0;
            while (k < l) 
            {
                ceu ceu1 = aceu[k];
                if (ceu1 != null)
                {
                    Object obj = (List)map.get(((dac)ebj1.a).c);
                    if (obj != null)
                    {
                        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
                        {
                            cag cag1 = (cag)((Iterator) (obj)).next();
                            cag1.h = ceu1.h;
                            cag1.g = ceu1.b();
                            cag1.i = ceu1.e;
                            cag1.f = ceu1.z;
                        }

                    }
                }
                k++;
            }
        }

        return true;
    }

    private List c(Map map, int k)
    {
        Object obj1;
        ArrayList arraylist;
        obj1 = new gz();
        for (map = map.values().iterator(); map.hasNext();)
        {
            caf caf1 = (caf)map.next();
            Iterator iterator = caf1.h.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                cag cag1 = (cag)iterator.next();
                if (!TextUtils.isEmpty(cag1.g))
                {
                    if (!((Map) (obj1)).containsKey(cag1.g))
                    {
                        ((Map) (obj1)).put(cag1.g, new ArrayList());
                    }
                    ((List)((Map) (obj1)).get(cag1.g)).add(caf1);
                }
            } while (true);
            iterator = caf1.i.values().iterator();
            while (iterator.hasNext()) 
            {
                cag cag2 = (cag)iterator.next();
                if (!TextUtils.isEmpty(cag2.g))
                {
                    if (!((Map) (obj1)).containsKey(cag2.g))
                    {
                        ((Map) (obj1)).put(cag2.g, new ArrayList());
                    }
                    ((List)((Map) (obj1)).get(cag2.g)).add(caf1);
                }
            }
        }

        arraylist = new ArrayList();
        map = EsProvider.b(EsProvider.a(EsProvider.i, k), 1);
        map = getContentResolver().query(map, b, "name != '' AND chat_id != ?", new String[] {
            dbf.e(k).b().b
        }, null);
        break MISSING_BLOCK_LABEL_312;
        obj1;
        Object obj;
        obj = map;
        map = ((Map) (obj1));
_L6:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw map;
        do
        {
            if (!map.moveToNext())
            {
                break;
            }
            String s = map.getString(1);
            if (!((Map) (obj1)).containsKey(s))
            {
                String s1 = map.getString(0);
                String s2 = map.getString(2);
                caf caf2 = new caf(this);
                caf2.f = s2;
                caf2.e = s1;
                caf2.a = s;
                arraylist.add(caf2);
                ((Map) (obj1)).put(caf2.a, new ArrayList());
                ((List)((Map) (obj1)).get(caf2.a)).add(caf2);
            }
        } while (true);
        if (map != null)
        {
            map.close();
        }
        obj = EsProvider.b(EsProvider.a(EsProvider.i, k), 0);
        obj = getContentResolver().query(((Uri) (obj)), b, "name != '' AND chat_id != ?", new String[] {
            dbf.e(k).b().b
        }, null);
_L4:
        map = ((Map) (obj));
        if (!((Cursor) (obj)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        map = ((Map) (obj));
        Object obj2 = ((Cursor) (obj)).getString(1);
        map = ((Map) (obj));
        if (!((Map) (obj1)).containsKey(obj2))
        {
            break MISSING_BLOCK_LABEL_619;
        }
        map = ((Map) (obj));
        obj2 = ((List)((Map) (obj1)).get(obj2)).iterator();
_L2:
        map = ((Map) (obj));
        if (!((Iterator) (obj2)).hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        map = ((Map) (obj));
        ((caf)((Iterator) (obj2)).next()).g = true;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        if (map != null)
        {
            map.close();
        }
        throw obj;
        map = ((Map) (obj));
        String s3 = ((Cursor) (obj)).getString(0);
        map = ((Map) (obj));
        String s4 = ((Cursor) (obj)).getString(2);
        map = ((Map) (obj));
        caf caf3 = new caf(this);
        map = ((Map) (obj));
        caf3.f = s4;
        map = ((Map) (obj));
        caf3.e = s3;
        map = ((Map) (obj));
        caf3.a = ((String) (obj2));
        map = ((Map) (obj));
        caf3.g = true;
        map = ((Map) (obj));
        arraylist.add(caf3);
        map = ((Map) (obj));
        ((Map) (obj1)).put(caf3.a, new ArrayList());
        map = ((Map) (obj));
        ((List)((Map) (obj1)).get(caf3.a)).add(caf3);
        if (true) goto _L4; else goto _L3
_L3:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return arraylist;
        map;
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void onHandleIntent(Intent intent)
    {
        Object obj3;
        int l;
        obj3 = null;
        l = intent.getIntExtra("account_id", -1);
        if (l != -1) goto _L2; else goto _L1
_L1:
        ebw.f("Babel_db", "Invalid account id passed to MergeContactsService");
_L4:
        return;
_L2:
        Object obj;
        Object obj1;
        gz gz1;
        gz gz2;
        String s;
        gmw gmw1;
        ebx ebx1;
        int k;
        boolean flag;
        obj = (chz)hgx.a(getApplicationContext(), chz);
        Object obj2;
        String s1;
        List list;
        long l1;
        long l3;
        boolean flag1;
        if (((chz) (obj)).a("android.permission.READ_CONTACTS") || ((chz) (obj)).a("android.permission.WRITE_CONTACTS"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = intent.getBooleanExtra("force_merge", false);
        gmw1 = ((gms)hgx.a(getApplicationContext(), gms)).b(l);
        l1 = System.currentTimeMillis();
        l3 = gmw1.a("last_merged_ts", 0L);
        if (flag == gmw1.d("last_merged_read_local_contacts") && l1 - l3 < e && !flag1) goto _L4; else goto _L3
_L3:
        try
        {
            gz1 = new gz();
            gz2 = new gz();
            ebx1 = new ebx("MergeContactsService");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            ebw.d("Babel", "Account was logged out while MergeContactsService was running", intent);
            return;
        }
        intent = bzx.d.buildUpon();
        intent.appendQueryParameter("account_id", Integer.toString(l));
        intent = getContentResolver().query(intent.build(), bzx.g, null, null, null);
_L8:
        if (!intent.moveToNext()) goto _L6; else goto _L5
_L5:
        s = intent.getString(3);
        s1 = intent.getString(4);
        k = intent.getInt(2);
        if (k != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (TextUtils.isEmpty(s1)) goto _L8; else goto _L7
_L7:
        obj = gz2;
        obj1 = s1;
_L10:
        list = (List)((Map) (obj)).get(obj1);
        obj2 = list;
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_314;
        }
        obj2 = new ArrayList();
        ((Map) (obj)).put(obj1, obj2);
        obj = new cag(this);
        obj.a = s;
        obj.b = s1;
        obj.c = intent.getString(5);
        obj.d = intent.getString(6);
        obj.f = ebr.d(intent.getInt(7));
        obj.e = ebr.d(intent.getInt(8));
        obj.g = intent.getString(9);
        obj.h = intent.getString(10);
        obj.i = intent.getString(11);
        obj.j = intent.getLong(12);
        ((List) (obj2)).add(obj);
          goto _L8
        obj1;
        obj = intent;
        intent = ((Intent) (obj1));
_L14:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_463;
        }
        ((Cursor) (obj)).close();
        throw intent;
        if (k != 1) goto _L8; else goto _L9
_L9:
        obj = gz1;
        obj1 = s;
          goto _L10
_L6:
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_508;
        }
        intent.close();
        ebx1.a("getOldDetails()");
        obj = new gz();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_546;
        }
        a(gz1, gz2, ((Map) (obj)));
        ebx1.a("getLocalContacts()");
        intent = obj3;
        if (!dbf.d(l))
        {
            a(gz1, l);
            ebx1.a("getEmailOnHangouts()");
            b(gz2, l);
            ebx1.a("getPhonesOnHangouts()");
            intent = c(((Map) (obj)), l);
            ebx1.a("getSuggestedContacts()");
        }
        obj1 = ((apj)hgx.a(getApplicationContext(), apj)).a(l).b();
        ((apd) (obj1)).a();
        ((apd) (obj1)).a("merged_contacts", null, null);
        f = 0;
        g = 0;
        h = 0;
        i = 0;
        j = 0;
        a(((apd) (obj1)), ((Map) (obj)).values());
        ebx1.a("writeMergedContacts(contactMap)");
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_703;
        }
        a(((apd) (obj1)), intent);
        ebx1.a("writeMergedContacts(suggestedContacts)");
        k = f;
        int i1 = g;
        int j1 = h;
        int k1 = i;
        ebw.e("Babel", (new StringBuilder(108)).append("Persisted ").append(k).append(" mergedContacts, ").append(i1).append(" phone numbers, ").append(j1).append(" emails, and ").append(k1).append(" gaiaIds").toString());
        intent = (bwf)hgx.a(getApplicationContext(), bwf);
        if (f != 0) goto _L12; else goto _L11
_L11:
        intent.a(l, 2568).a(TimeUnit.DAYS);
_L13:
        ((apd) (obj1)).b();
        ((apd) (obj1)).c();
        long l2 = System.currentTimeMillis();
        gmw1.c("last_merged_ts", l2);
        gmw1.c("last_merged_read_local_contacts", flag);
        gmw1.d();
        intent = String.valueOf("last_merged_ts");
        ebw.e("Babel", (new StringBuilder(String.valueOf(intent).length() + 46)).append("wrote ").append(l2).append(" as ").append(intent).append(" to accountStore").toString());
        getContentResolver().notifyChange(bzx.c, null);
        return;
_L12:
        intent.a(l, 2549).a(Integer.valueOf(f)).a(TimeUnit.DAYS);
        if (f > 20)
        {
            break MISSING_BLOCK_LABEL_1039;
        }
        if (j == 0)
        {
            k = 2569;
        } else
        {
            k = 2550;
        }
        intent.a(l, k).a(Integer.valueOf(j)).a(TimeUnit.DAYS);
          goto _L13
        if (f > 100)
        {
            break MISSING_BLOCK_LABEL_1063;
        }
        if (j == 0)
        {
            k = 2743;
        } else
        {
            k = 2742;
        }
        break MISSING_BLOCK_LABEL_1006;
        k = j;
        if (k == 0)
        {
            k = 2745;
        } else
        {
            k = 2744;
        }
        break MISSING_BLOCK_LABEL_1006;
        intent;
        obj = null;
          goto _L14
    }

    static 
    {
        d = TimeUnit.DAYS.toMillis(1L);
        e = TimeUnit.SECONDS.toMillis(10L);
    }
}
