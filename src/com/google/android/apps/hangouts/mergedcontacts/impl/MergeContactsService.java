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
import aoa;
import aps;
import apu;
import apv;
import aqb;
import cba;
import cbi;
import cbj;
import cbk;
import cbl;
import cbn;
import cfz;
import cgd;
import cjf;
import com.google.android.apps.hangouts.content.EsProvider;
import cuo;
import cym;
import dbi;
import dcn;
import dcz;
import dfw;
import dfx;
import eeh;
import eev;
import eew;
import eey;
import g;
import gcz;
import gda;
import gdd;
import gqz;
import grd;
import gz;
import hlp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import jrw;
import jso;
import jsq;
import jwl;
import jwn;
import jwr;
import jws;

public class MergeContactsService extends IntentService
{

    static final String a[] = {
        "lookup", "contact_id", "display_name", "raw_contact_id", "photo_uri", "mimetype", "data1", "data2", "data3", "data4"
    };
    static final jso b = (new jsq()).a("data1", Integer.valueOf(6)).a("data2", Integer.valueOf(7)).a("data3", Integer.valueOf(8)).a("data4", Integer.valueOf(9)).a();
    static final String c[] = {
        "name", "gaia_id", "profile_photo_url"
    };
    private static final String d = String.format(" contact_id in default_directory AND %s IN ('%s','%s','%s') AND %s is null", new Object[] {
        "mimetype", "vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/email_v2", "vnd.android.cursor.item/photo", "data_set"
    });
    private static final long e;
    private static final long f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;

    public MergeContactsService()
    {
        super("MergeContactsService");
    }

    private List a(Collection collection, int l)
    {
        Object obj1;
        ArrayList arraylist;
        obj1 = new jrw();
        for (collection = collection.iterator(); collection.hasNext();)
        {
            cbi cbi1 = (cbi)collection.next();
            Iterator iterator = cbi1.h.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                cbj cbj1 = (cbj)iterator.next();
                if (!TextUtils.isEmpty(cbj1.g))
                {
                    ((jwl) (obj1)).a(cbj1.g, cbi1);
                }
            } while (true);
            iterator = cbi1.i.values().iterator();
            while (iterator.hasNext()) 
            {
                cbj cbj2 = (cbj)iterator.next();
                if (!TextUtils.isEmpty(cbj2.g))
                {
                    ((jwl) (obj1)).a(cbj2.g, cbi1);
                }
            }
        }

        arraylist = new ArrayList();
        collection = EsProvider.b(EsProvider.a(EsProvider.i, l), 1);
        collection = getContentResolver().query(collection, c, "name != '' AND chat_id != ?", new String[] {
            dcn.e(l).b().b
        }, null);
        break MISSING_BLOCK_LABEL_220;
        obj1;
        Object obj;
        obj = collection;
        collection = ((Collection) (obj1));
_L6:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw collection;
        do
        {
            if (!collection.moveToNext())
            {
                break;
            }
            String s = collection.getString(1);
            if (!((jwl) (obj1)).c(s))
            {
                String s1 = collection.getString(0);
                String s2 = collection.getString(2);
                cbi cbi2 = new cbi();
                cbi2.f = s2;
                cbi2.e = s1;
                cbi2.a = s;
                arraylist.add(cbi2);
                ((jwl) (obj1)).a(cbi2.a, cbi2);
            }
        } while (true);
        if (collection != null)
        {
            collection.close();
        }
        obj = EsProvider.b(EsProvider.a(EsProvider.i, l), 0);
        obj = getContentResolver().query(((Uri) (obj)), c, "name != '' AND chat_id != ?", new String[] {
            dcn.e(l).b().b
        }, null);
_L4:
        collection = ((Collection) (obj));
        if (!((Cursor) (obj)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        collection = ((Collection) (obj));
        Object obj2 = ((Cursor) (obj)).getString(1);
        collection = ((Collection) (obj));
        if (!((jwl) (obj1)).c(obj2))
        {
            break MISSING_BLOCK_LABEL_494;
        }
        collection = ((Collection) (obj));
        obj2 = ((jwl) (obj1)).b(obj2).iterator();
_L2:
        collection = ((Collection) (obj));
        if (!((Iterator) (obj2)).hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        collection = ((Collection) (obj));
        ((cbi)((Iterator) (obj2)).next()).g = true;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        if (collection != null)
        {
            collection.close();
        }
        throw obj;
        collection = ((Collection) (obj));
        String s3 = ((Cursor) (obj)).getString(0);
        collection = ((Collection) (obj));
        String s4 = ((Cursor) (obj)).getString(2);
        collection = ((Collection) (obj));
        cbi cbi3 = new cbi();
        collection = ((Collection) (obj));
        cbi3.f = s4;
        collection = ((Collection) (obj));
        cbi3.e = s3;
        collection = ((Collection) (obj));
        cbi3.a = ((String) (obj2));
        collection = ((Collection) (obj));
        cbi3.g = true;
        collection = ((Collection) (obj));
        arraylist.add(cbi3);
        collection = ((Collection) (obj));
        ((jwl) (obj1)).a(cbi3.a, cbi3);
        if (true) goto _L4; else goto _L3
_L3:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return arraylist;
        collection;
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static List a(jwl jwl1)
    {
        ArrayList arraylist = new ArrayList();
        long l1 = System.currentTimeMillis();
        Iterator iterator = jwl1.k().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s3 = (String)iterator.next();
            Object obj = jwl1.b(s3);
            Iterator iterator1 = ((Collection) (obj)).iterator();
            boolean flag = false;
            String s2 = null;
            long l = 0L;
            String s = null;
            String s1 = null;
            while (iterator1.hasNext()) 
            {
                cbj cbj2 = (cbj)iterator1.next();
                if (cbj2.f)
                {
                    flag = true;
                }
                if (!TextUtils.isEmpty(cbj2.g))
                {
                    s2 = cbj2.g;
                }
                if (!TextUtils.isEmpty(cbj2.h))
                {
                    s1 = cbj2.h;
                }
                if (!TextUtils.isEmpty(cbj2.i))
                {
                    s = cbj2.i;
                }
                l = Math.max(l, cbj2.j);
            }
            boolean flag1 = TextUtils.isEmpty(s2);
            if (((Collection) (obj)).size() > 1)
            {
                for (obj = ((Collection) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
                {
                    cbj cbj1 = (cbj)((Iterator) (obj)).next();
                    cbj1.f = flag;
                    cbj1.g = s2;
                    cbj1.h = s1;
                    cbj1.i = s;
                    cbj1.j = l;
                    cbj1.e = flag1;
                }

            }
            if (!flag && l1 - l > e)
            {
                arraylist.add(s3);
            }
        } while (true);
        return arraylist;
    }

    private void a(apv apv1, Collection collection)
    {
        ContentValues contentvalues = new ContentValues();
        ContentValues contentvalues1 = new ContentValues();
        for (collection = collection.iterator(); collection.hasNext(); apv1.d())
        {
            cbi cbi1 = (cbi)collection.next();
            contentvalues.clear();
            contentvalues.put("contact_lookup_key", cbi1.b);
            contentvalues.put("contact_id", cbi1.c);
            contentvalues.put("raw_contact_id", cbi1.d);
            contentvalues.put("display_name", eey.p(cbi1.e));
            contentvalues.put("avatar_url", cbi1.f);
            contentvalues.put("is_frequent", Boolean.valueOf(cbi1.g));
            long l = apv1.a("merged_contacts", contentvalues);
            g = g + 1;
            Iterator iterator = cbi1.h.values().iterator();
            cbn cbn1;
            boolean flag;
            for (flag = false; iterator.hasNext(); flag = cbn1.f | flag)
            {
                cbn1 = (cbn)iterator.next();
                contentvalues1.clear();
                contentvalues1.put("lookup_data_type", Integer.valueOf(0));
                contentvalues1.put("lookup_data", cbn1.a);
                contentvalues1.put("lookup_data_display", eey.p(cbn1.a));
                contentvalues1.put("lookup_data_standardized", cbn1.b);
                contentvalues1.put("lookup_data_search", cbn1.c);
                contentvalues1.put("lookup_data_label", cbn1.d);
                contentvalues1.put("is_hangouts_user", Boolean.valueOf(cbn1.f));
                contentvalues1.put("gaia_id", cbn1.g);
                contentvalues1.put("needs_gaia_ids_resolved", Boolean.valueOf(cbn1.e));
                contentvalues1.put("avatar_url", cbn1.h);
                contentvalues1.put("display_name", cbn1.i);
                contentvalues1.put("last_checked_ts", Long.valueOf(cbn1.j));
                contentvalues1.put("merged_contact_id", Long.valueOf(l));
                apv1.a("merged_contact_details", contentvalues1);
                h = h + 1;
            }

            for (Iterator iterator1 = cbi1.i.values().iterator(); iterator1.hasNext();)
            {
                cbk cbk1 = (cbk)iterator1.next();
                contentvalues1.clear();
                contentvalues1.put("lookup_data_type", Integer.valueOf(1));
                contentvalues1.put("lookup_data", cbk1.a);
                contentvalues1.putNull("lookup_data_display");
                contentvalues1.putNull("lookup_data_standardized");
                contentvalues1.putNull("lookup_data_search");
                contentvalues1.put("lookup_data_label", cbk1.d);
                contentvalues1.put("is_hangouts_user", Boolean.valueOf(cbk1.f));
                contentvalues1.put("gaia_id", cbk1.g);
                contentvalues1.put("needs_gaia_ids_resolved", Boolean.valueOf(cbk1.e));
                contentvalues1.put("avatar_url", cbk1.h);
                contentvalues1.put("display_name", cbk1.i);
                contentvalues1.put("last_checked_ts", Long.valueOf(cbk1.j));
                contentvalues1.put("merged_contact_id", Long.valueOf(l));
                apv1.a("merged_contact_details", contentvalues1);
                i = i + 1;
                flag |= cbk1.f;
            }

            if (!TextUtils.isEmpty(cbi1.a))
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
                contentvalues1.put("gaia_id", cbi1.a);
                contentvalues1.putNull("avatar_url");
                contentvalues1.putNull("display_name");
                contentvalues1.put("last_checked_ts", Integer.valueOf(0));
                apv1.a("merged_contact_details", contentvalues1);
                j = j + 1;
                flag = true;
            }
            if (flag)
            {
                k = k + 1;
            }
        }

    }

    private void a(jwl jwl1, int l)
    {
        Object obj = a(jwl1);
        long l1 = System.currentTimeMillis();
        if (!((List) (obj)).isEmpty())
        {
            if (dcz.A(l))
            {
                Object obj1 = cuo.a(l, 2, null, ((Collection) (obj)));
                if (((cuo) (obj1)).m())
                {
                    l = 0;
                } else
                {
                    for (obj1 = ((dfw)((cuo) (obj1)).e()).g.entrySet().iterator(); ((Iterator) (obj1)).hasNext();)
                    {
                        Object obj3 = (java.util.Map.Entry)((Iterator) (obj1)).next();
                        Object obj4 = jwl1.b(((java.util.Map.Entry) (obj3)).getKey());
                        obj3 = (dfx)((java.util.Map.Entry) (obj3)).getValue();
                        obj4 = ((Collection) (obj4)).iterator();
                        while (((Iterator) (obj4)).hasNext()) 
                        {
                            cbj cbj1 = (cbj)((Iterator) (obj4)).next();
                            cbj1.h = ((dfx) (obj3)).c;
                            cbj1.g = ((dfx) (obj3)).b;
                            cbj1.i = ((dfx) (obj3)).d;
                            cbj1.f = ((dfx) (obj3)).a;
                            cbj1.e = TextUtils.isEmpty(((dfx) (obj3)).b);
                        }
                    }

                    l = 1;
                }
            } else
            {
                Object obj2 = new ConditionVariable();
                cbl cbl1 = new cbl(this, ((ConditionVariable) (obj2)));
                cbl1.a(((Collection) (obj)), l);
                ((ConditionVariable) (obj2)).block();
                obj2 = cbl1.a;
                if (obj2 == null)
                {
                    l = 0;
                } else
                {
                    for (obj2 = ((cym) (obj2)).k().iterator(); ((Iterator) (obj2)).hasNext();)
                    {
                        eeh eeh1 = (eeh)((Iterator) (obj2)).next();
                        cfz acfz[] = (cfz[])eeh1.b;
                        int i1 = acfz.length;
                        l = 0;
                        while (l < i1) 
                        {
                            cfz cfz1 = acfz[l];
                            if (cfz1 != null)
                            {
                                for (Iterator iterator = jwl1.b(((dbi)eeh1.a).c).iterator(); iterator.hasNext();)
                                {
                                    cbj cbj2 = (cbj)iterator.next();
                                    cbj2.h = cfz1.h;
                                    cbj2.g = cfz1.b();
                                    cbj2.i = cfz1.e;
                                    cbj2.f = cfz1.z;
                                    cbj2.e = TextUtils.isEmpty(cfz1.b());
                                }

                            }
                            l++;
                        }
                    }

                    l = 1;
                }
            }
            if (l != 0)
            {
                for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
                {
                    obj1 = jwl1.b((String)((Iterator) (obj)).next()).iterator();
                    while (((Iterator) (obj1)).hasNext()) 
                    {
                        ((cbj)((Iterator) (obj1)).next()).j = l1;
                    }
                }

            }
        }
    }

    private static void b(jwl jwl1, int l)
    {
        long l1 = System.currentTimeMillis();
        Object obj = a(jwl1);
        if (!((List) (obj)).isEmpty() && dcz.A(l))
        {
            Object obj1 = cuo.a(l, 3, Integer.valueOf(2), ((Collection) (obj)));
            if (!((cuo) (obj1)).m())
            {
                for (obj1 = ((dfw)((cuo) (obj1)).e()).g.entrySet().iterator(); ((Iterator) (obj1)).hasNext();)
                {
                    Object obj2 = (java.util.Map.Entry)((Iterator) (obj1)).next();
                    Object obj3 = jwl1.b(((java.util.Map.Entry) (obj2)).getKey());
                    obj2 = (dfx)((java.util.Map.Entry) (obj2)).getValue();
                    obj3 = ((Collection) (obj3)).iterator();
                    while (((Iterator) (obj3)).hasNext()) 
                    {
                        cbj cbj1 = (cbj)((Iterator) (obj3)).next();
                        cbj1.h = ((dfx) (obj2)).c;
                        cbj1.i = ((dfx) (obj2)).d;
                        cbj1.f = ((dfx) (obj2)).a;
                    }
                }

                for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
                {
                    Iterator iterator = jwl1.b((String)((Iterator) (obj)).next()).iterator();
                    while (iterator.hasNext()) 
                    {
                        ((cbj)iterator.next()).j = l1;
                    }
                }

            }
        }
    }

    protected void onHandleIntent(Intent intent)
    {
        int i1 = intent.getIntExtra("account_id", -1);
        if (i1 != -1) goto _L2; else goto _L1
_L1:
        eev.f("Babel_db", "Invalid account id passed to MergeContactsService");
_L4:
        return;
_L2:
        Object obj;
        grd grd1;
        eew eew1;
        jwl jwl1;
        jwl jwl2;
        int l;
        boolean flag;
        obj = (cjf)hlp.a(getApplicationContext(), cjf);
        Exception exception;
        long l2;
        long l4;
        boolean flag1;
        if (((cjf) (obj)).a("android.permission.READ_CONTACTS") || ((cjf) (obj)).a("android.permission.WRITE_CONTACTS"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = intent.getBooleanExtra("force_merge", false);
        grd1 = ((gqz)hlp.a(getApplicationContext(), gqz)).b(i1);
        l2 = System.currentTimeMillis();
        l4 = grd1.a("last_merged_ts", 0L);
        if (flag == grd1.d("last_merged_read_local_contacts") && l2 - l4 < f && !flag1) goto _L4; else goto _L3
_L3:
        try
        {
            g.c(8, "expectedKeys");
            jwl1 = (new jwn(8)).d().a();
            g.c(8, "expectedKeys");
            jwl2 = (new jwn(8)).d().a();
            eew1 = new eew("MergeContactsService");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            eev.d("Babel", "Account was logged out while MergeContactsService was running", intent);
            return;
        }
        intent = cba.d.buildUpon();
        intent.appendQueryParameter("account_id", Integer.toString(i1));
        intent = getContentResolver().query(intent.build(), cba.g, null, null, null);
_L9:
        if (!intent.moveToNext()) goto _L6; else goto _L5
_L5:
        l = intent.getInt(2);
        if (l != 0) goto _L8; else goto _L7
_L7:
        obj = cbn.a(intent);
        if (!TextUtils.isEmpty(((cbn) (obj)).b) && !((cbn) (obj)).a())
        {
            jwl2.a(((cbn) (obj)).b, obj);
        }
          goto _L9
        exception;
        obj = intent;
        intent = exception;
_L53:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_326;
        }
        ((Cursor) (obj)).close();
        throw intent;
_L8:
        if (l != 1) goto _L9; else goto _L10
_L10:
        obj = cbk.a(intent);
        if (!((cbk) (obj)).a())
        {
            jwl1.a(((cbk) (obj)).a, obj);
        }
          goto _L9
_L6:
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_390;
        }
        intent.close();
        gz gz1;
        eew1.a("retrieveOldDetails()");
        gz1 = new gz();
        if (!flag) goto _L12; else goto _L11
_L11:
        obj = getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, a, d, null, null);
        if (obj != null) goto _L14; else goto _L13
_L13:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_445;
        }
        ((Cursor) (obj)).close();
_L44:
        eew1.a("retrieveLocalContacts()");
_L12:
        if (dcn.d(i1)) goto _L16; else goto _L15
_L15:
        a(jwl1, i1);
        eew1.a("findEmailOnHangouts()");
        b(jwl2, i1);
        eew1.a("findPhonesOnHangouts()");
        intent = a(gz1.values(), i1);
        eew1.a("getSuggestedContacts()");
_L45:
        Collection collection = gz1.values();
        obj = ((aqb)hlp.a(getApplicationContext(), aqb)).a(i1).b();
        ((apv) (obj)).a();
        ((apv) (obj)).a("merged_contacts", null, null);
        g = 0;
        h = 0;
        i = 0;
        j = 0;
        k = 0;
        a(((apv) (obj)), collection);
        eew1.a("writeMergedContacts(contactMap)");
        a(((apv) (obj)), intent);
        eew1.a("writeMergedContacts(suggestedContacts)");
        l = g;
        int j1 = h;
        int k1 = i;
        int l1 = j;
        eev.e("Babel", (new StringBuilder(108)).append("Persisted ").append(l).append(" mergedContacts, ").append(j1).append(" phone numbers, ").append(k1).append(" emails, and ").append(l1).append(" gaiaIds").toString());
        intent = (gdd)hlp.a(getApplicationContext(), gdd);
        if (g != 0) goto _L18; else goto _L17
_L17:
        intent.a(i1).a(2568).a(TimeUnit.DAYS);
_L50:
        ((apv) (obj)).b();
        ((apv) (obj)).c();
        long l3 = System.currentTimeMillis();
        grd1.c("last_merged_ts", l3);
        grd1.c("last_merged_read_local_contacts", flag);
        grd1.d();
        intent = String.valueOf("last_merged_ts");
        eev.e("Babel", (new StringBuilder(String.valueOf(intent).length() + 46)).append("wrote ").append(l3).append(" as ").append(intent).append(" to accountStore").toString());
        getContentResolver().notifyChange(cba.c, null);
        return;
_L14:
        if (!((Cursor) (obj)).moveToNext()) goto _L20; else goto _L19
_L19:
        Object obj1;
        intent = ((Cursor) (obj)).getString(0);
        obj1 = (cbi)gz1.get(intent);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_964;
        }
        obj1 = new cbi();
        obj1.b = intent;
        gz1.put(intent, obj1);
        obj1.c = Long.valueOf(((Cursor) (obj)).getLong(1));
        obj1.d = Long.valueOf(((Cursor) (obj)).getLong(3));
        obj1.e = ((Cursor) (obj)).getString(2);
        intent = ((Cursor) (obj)).getString(5);
        if (!"vnd.android.cursor.item/photo".equals(intent)) goto _L22; else goto _L21
_L21:
        obj1.f = ((Cursor) (obj)).getString(4);
          goto _L14
        intent;
_L52:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1006;
        }
        ((Cursor) (obj)).close();
        throw intent;
_L22:
        if (!"vnd.android.cursor.item/phone_v2".equals(intent)) goto _L24; else goto _L23
_L23:
        String s;
        intent = getApplicationContext();
        s = ((Cursor) (obj)).getString(g.a((Integer)b.get("data1"), 0));
        if (android.os.Build.VERSION.SDK_INT < 16) goto _L26; else goto _L25
_L25:
        Object obj2 = ((Cursor) (obj)).getString(g.a((Integer)b.get("data4"), 0));
_L32:
        l = ((Cursor) (obj)).getInt(g.a((Integer)b.get("data2"), 0));
        if (l != 0) goto _L28; else goto _L27
_L27:
        intent = ((Cursor) (obj)).getString(g.a((Integer)b.get("data3"), 0));
_L33:
        cbn cbn1;
        String s1 = eey.h(s);
        cbn1 = new cbn();
        cbn1.a = s;
        cbn1.b = ((String) (obj2));
        cbn1.c = s1;
        cbn1.d = intent;
        boolean flag2;
        if (!TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        cbn1.e = flag2;
        if (cbn1.a()) goto _L14; else goto _L29
_L29:
        obj1 = ((cbi) (obj1)).h;
        if (cbn1.b == null) goto _L31; else goto _L30
_L30:
        intent = cbn1.b;
_L36:
        ((Map) (obj1)).put(intent, cbn1);
        if (!TextUtils.isEmpty(cbn1.b))
        {
            jwl2.a(cbn1.b, cbn1);
        }
          goto _L14
_L26:
        obj2 = eey.k(((Cursor) (obj)).getString(g.a((Integer)b.get("data1"), 0)));
          goto _L32
_L28:
label0:
        {
            if (!"vnd.android.cursor.item/phone_v2".equals("vnd.android.cursor.item/phone_v2"))
            {
                break label0;
            }
            intent = (String)android.provider.ContactsContract.CommonDataKinds.Phone.getTypeLabel(intent.getResources(), l, null);
        }
          goto _L33
        if (!"vnd.android.cursor.item/phone_v2".equals("vnd.android.cursor.item/email_v2")) goto _L35; else goto _L34
_L34:
        intent = (String)android.provider.ContactsContract.CommonDataKinds.Email.getTypeLabel(intent.getResources(), l, null);
          goto _L33
_L31:
        intent = cbn1.a;
          goto _L36
_L24:
        if (!"vnd.android.cursor.item/email_v2".equals(intent)) goto _L38; else goto _L37
_L37:
        intent = getApplicationContext();
        obj2 = new cbk();
        obj2.a = ((Cursor) (obj)).getString(g.a((Integer)b.get("data1"), 0));
        l = ((Cursor) (obj)).getInt(g.a((Integer)b.get("data2"), 0));
        if (l != 0) goto _L40; else goto _L39
_L39:
        intent = ((Cursor) (obj)).getString(g.a((Integer)b.get("data3"), 0));
_L41:
        obj2.d = intent;
        obj2.e = true;
        if (!((cbk) (obj2)).a())
        {
            jwl1.a(((cbk) (obj2)).a, obj2);
            ((cbi) (obj1)).i.put(((cbk) (obj2)).a, obj2);
        }
          goto _L14
_L40:
label1:
        {
            if (!"vnd.android.cursor.item/email_v2".equals("vnd.android.cursor.item/phone_v2"))
            {
                break label1;
            }
            intent = (String)android.provider.ContactsContract.CommonDataKinds.Phone.getTypeLabel(intent.getResources(), l, null);
        }
          goto _L41
        if (!"vnd.android.cursor.item/email_v2".equals("vnd.android.cursor.item/email_v2"))
        {
            break MISSING_BLOCK_LABEL_1868;
        }
        intent = (String)android.provider.ContactsContract.CommonDataKinds.Email.getTypeLabel(intent.getResources(), l, null);
          goto _L41
_L38:
        intent = String.valueOf(intent);
        if (intent.length() == 0)
        {
            break MISSING_BLOCK_LABEL_1583;
        }
        intent = "unexpected mime-type: ".concat(intent);
_L42:
        eev.f("Babel_db", intent);
          goto _L14
        intent = new String("unexpected mime-type: ");
          goto _L42
_L20:
        intent = gz1.values().iterator();
        do
        {
            if (!intent.hasNext())
            {
                break;
            }
            cbi cbi1 = (cbi)intent.next();
            if (cbi1.h.isEmpty() && cbi1.i.isEmpty())
            {
                intent.remove();
            }
        } while (true);
        if (obj == null) goto _L44; else goto _L43
_L43:
        ((Cursor) (obj)).close();
          goto _L44
_L16:
        intent = Collections.EMPTY_LIST;
          goto _L45
_L18:
        intent.a(i1).a(2549).a(Integer.valueOf(g)).a(TimeUnit.DAYS);
        if (k != 0) goto _L47; else goto _L46
_L46:
        if (g > 20) goto _L49; else goto _L48
_L48:
        l = 2569;
_L51:
        intent.a(i1).a(l).a(Integer.valueOf(k)).a(TimeUnit.DAYS);
          goto _L50
_L49:
        if (g <= 100)
        {
            l = 2743;
        } else
        {
            l = 2745;
        }
          goto _L51
_L47:
        if (g > 20)
        {
            break MISSING_BLOCK_LABEL_1811;
        }
        l = 2550;
          goto _L51
        l = g;
        if (l <= 100)
        {
            l = 2742;
        } else
        {
            l = 2744;
        }
          goto _L51
        intent;
        obj = null;
          goto _L52
        intent;
        obj = null;
          goto _L53
_L35:
        intent = "";
          goto _L33
        intent = "";
          goto _L41
    }

    static 
    {
        e = TimeUnit.DAYS.toMillis(1L);
        f = TimeUnit.SECONDS.toMillis(10L);
    }
}
