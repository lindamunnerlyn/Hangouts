// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.format.Time;
import android.view.ContextMenu;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import ani;
import aoe;
import apd;
import cko;
import ckp;
import ckq;
import ckr;
import ckt;
import cku;
import ckw;
import ckx;
import cky;
import ckz;
import cla;
import clb;
import clc;
import cld;
import cle;
import clf;
import clg;
import clh;
import cli;
import clj;
import clk;
import cll;
import ctr;
import cvn;
import dbf;
import ebw;
import g;
import gmo;
import gms;
import gmw;
import gng;
import h;
import hgx;
import hhg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class DebugActivity extends hhg
{

    private static final String n[] = {
        "url:hangouts_conserver", "url:hangouts_conserver_upload", "url:hangouts_rs"
    };
    private final gmo c;
    private TextView d;
    private ListView e;
    private aoe f;
    private ListView g;
    private RecordingService h;
    private ArrayAdapter i;
    private ani j;
    private boolean k;
    private gms l;
    private ServiceConnection m;

    public DebugActivity()
    {
        c = (new gng(this, b)).a(a);
    }

    public static android.widget.AdapterView.OnItemClickListener a(DebugActivity debugactivity, Cursor cursor)
    {
        return new ckw(debugactivity, cursor);
    }

    public static ArrayAdapter a(DebugActivity debugactivity, ArrayAdapter arrayadapter)
    {
        debugactivity.i = arrayadapter;
        return arrayadapter;
    }

    private BaseAdapter a(Cursor cursor)
    {
        ArrayList arraylist = new ArrayList();
        if (cursor.moveToPosition(0))
        {
            List list = Arrays.asList((Object[])cursor.getColumnNames().clone());
            Collections.sort(list);
            for (Iterator iterator = list.iterator(); iterator.hasNext();)
            {
                String s = (String)iterator.next();
                try
                {
                    arraylist.add(cursor.getString(cursor.getColumnIndex(s)));
                }
                catch (Exception exception)
                {
                    String s1 = String.valueOf(exception.getMessage());
                    if (s1.length() != 0)
                    {
                        s1 = "???: ".concat(s1);
                    } else
                    {
                        s1 = new String("???: ");
                    }
                    arraylist.add(s1);
                }
            }

            cursor = list;
        } else
        {
            cursor = new ArrayList();
        }
        return a(((List) (cursor)), ((List) (arraylist)));
    }

    private BaseAdapter a(Cursor cursor, int ai[])
    {
        return new ckq(this, cursor, ai);
    }

    public static BaseAdapter a(DebugActivity debugactivity, Cursor cursor, int ai[])
    {
        return debugactivity.a(cursor, ai);
    }

    public static BaseAdapter a(DebugActivity debugactivity, List list, List list1)
    {
        return debugactivity.a(list, list1);
    }

    private BaseAdapter a(List list, List list1)
    {
        return new ckp(this, list, list1);
    }

    public static aoe a(DebugActivity debugactivity, aoe aoe1)
    {
        debugactivity.f = aoe1;
        return aoe1;
    }

    public static RecordingService a(DebugActivity debugactivity, RecordingService recordingservice)
    {
        debugactivity.h = recordingservice;
        return recordingservice;
    }

    public static String a(ani ani1, String s)
    {
        apd apd1 = (new aoe(g.nS, ani1.h())).e();
        ani1 = new StringBuilder();
        Cursor cursor = apd1.a("conversations", null, "conversation_id=?", new String[] {
            s
        }, "sort_timestamp DESC");
        a(((StringBuilder) (ani1)), cursor, "CONVERSATIONS", "conversation_id");
        cursor.close();
        cursor = apd1.a("conversation_participants_view", null, "conversation_id=?", new String[] {
            s
        }, null);
        ani1.append("PARTICIPANTS\n");
        a(((StringBuilder) (ani1)), cursor, "PARTICIPANTS", "_id");
        cursor.close();
        s = apd1.a("messages", null, "conversation_id=?", new String[] {
            s
        }, "timestamp ASC");
        a(((StringBuilder) (ani1)), ((Cursor) (s)), "MESSAGES", "message_id");
        s.close();
        return ani1.toString();
    }

    public static String a(String s, Object obj)
    {
        return b(s, obj);
    }

    private void a()
    {
        Cursor cursor = f.e().a("conversations", null, null, null, "sort_timestamp DESC");
        BaseAdapter baseadapter = a(cursor, new int[] {
            cursor.getColumnIndex("generated_name"), cursor.getColumnIndex("conversation_id")
        });
        e.setAdapter(baseadapter);
        e.setOnItemClickListener(new cky(this, cursor));
    }

    public static void a(Context context)
    {
        (new Thread(new clj(context))).start();
    }

    private void a(View view, Cursor cursor, Runnable runnable)
    {
        Display display = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        display.getSize(point);
        view = new PopupWindow(view, point.x, point.y - 25);
        view.setFocusable(true);
        view.setBackgroundDrawable(new ColorDrawable(-1));
        view.setOnDismissListener(new cle(this, cursor, runnable));
        view.showAtLocation(getWindow().getDecorView(), 0, 0, 0);
    }

    public static void a(DebugActivity debugactivity)
    {
        debugactivity.a();
        debugactivity.registerForContextMenu(debugactivity.e);
        debugactivity.getContentResolver();
        String as[] = new String[3];
        as[0] = g.a(debugactivity, n[0], null);
        as[1] = g.a(debugactivity, n[1], null);
        as[2] = g.a(debugactivity, n[2], null);
        Object obj1 = debugactivity.d;
        Object obj = as[0];
        boolean flag;
        if (obj != null)
        {
            for (; ((String) (obj)).endsWith("/"); obj = ((String) (obj)).substring(0, ((String) (obj)).length() - 1)) { }
            TextView textview;
            if (((String) (obj)).endsWith("daily"))
            {
                obj = "DAILY";
            } else
            if (((String) (obj)).endsWith("staging"))
            {
                obj = "STAGING";
            } else
            {
                obj = "PROD";
            }
        } else
        {
            obj = "UNKNOWN";
        }
        ((TextView) (obj1)).setText(((CharSequence) (obj)));
        debugactivity.d.setOnClickListener(new clb(debugactivity, as));
        debugactivity.d.setOnLongClickListener(new clf(debugactivity, as));
        debugactivity.g = (ListView)debugactivity.findViewById(h.fB);
        textview = (TextView)debugactivity.findViewById(h.ds);
        obj = (TextView)debugactivity.findViewById(h.fO);
        obj1 = new clg(debugactivity, textview, ((TextView) (obj)));
        ((TextView) (obj)).setText("REALTIMECHATSERVICE");
        ((TextView) (obj)).setOnClickListener(((android.view.View.OnClickListener) (obj1)));
        obj = String.valueOf(debugactivity.f.e().e().getPath());
        if (((String) (obj)).length() != 0)
        {
            obj = "CONVERSATIONS - DB: ".concat(((String) (obj)));
        } else
        {
            obj = new String("CONVERSATIONS - DB: ");
        }
        textview.setText(((CharSequence) (obj)));
        textview.setOnClickListener(((android.view.View.OnClickListener) (obj1)));
        obj = (CheckBox)debugactivity.findViewById(h.at);
        ((CheckBox) (obj)).setText("RECORD AFTER EXIT");
        if (debugactivity.f.O("DEBUG_RTCS") > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((CheckBox) (obj)).setChecked(flag);
        ((CheckBox) (obj)).setOnCheckedChangeListener(new clh(debugactivity));
        debugactivity.startService(c(debugactivity));
    }

    public static void a(DebugActivity debugactivity, View view, Cursor cursor, Runnable runnable)
    {
        debugactivity.a(view, cursor, runnable);
    }

    public static void a(DebugActivity debugactivity, String s, String s1)
    {
        Cursor cursor = debugactivity.f.e().a(s1, null, "conversation_id=?", new String[] {
            s
        }, "sort_timestamp DESC");
        View view = debugactivity.getLayoutInflater().inflate(g.fM, null);
        Button button = (Button)view.findViewById(h.fQ);
        Button button1 = (Button)view.findViewById(h.fS);
        Button button2 = (Button)view.findViewById(h.fR);
        if ("conversations_view".equals(s1))
        {
            button.setText("switch to conversation view");
            button.setVisibility(0);
            button.setOnClickListener(new ckt(debugactivity, s));
        }
        button1.setText("show participants");
        button1.setVisibility(0);
        button1.setOnClickListener(new cku(debugactivity, s, button2, button1, button));
        button2.setText("show messages");
        button2.setVisibility(0);
        button2.setOnClickListener(new ckr(debugactivity, s, button2, button1, button));
        ((ListView)view.findViewById(0x102000a)).setAdapter(debugactivity.a(cursor));
        debugactivity.a(view, cursor, ((Runnable) (null)));
    }

    private static void a(StringBuilder stringbuilder, Cursor cursor, String s, String s1)
    {
        stringbuilder.append(s);
        stringbuilder.append("; count == ");
        stringbuilder.append(cursor.getCount());
        stringbuilder.append("\n\n");
        if (cursor.moveToFirst())
        {
            s = (String[])cursor.getColumnNames().clone();
            Arrays.sort(s);
            int l1 = s.length;
            int j1 = 0;
            int i1 = 0;
            for (; j1 < l1; j1++)
            {
                i1 = Math.max(i1, s[j1].length());
            }

            do
            {
                stringbuilder.append(">>>>>>>>>> ");
                stringbuilder.append(s1);
                stringbuilder.append("    ");
                stringbuilder.append(cursor.getString(cursor.getColumnIndex(s1)));
                stringbuilder.append("\n\n");
                int k2 = s.length;
                int k1 = 0;
                while (k1 < k2) 
                {
                    String s2 = s[k1];
                    for (int i2 = 0; i2 <= 0; i2++)
                    {
                        stringbuilder.append("    ");
                    }

                    stringbuilder.append(s2);
                    for (int j2 = (i1 - s2.length()) + 1; j2 >= 0; j2--)
                    {
                        stringbuilder.append(' ');
                    }

                    try
                    {
                        stringbuilder.append(cursor.getString(cursor.getColumnIndex(s2)));
                    }
                    catch (Exception exception)
                    {
                        stringbuilder.append("???");
                    }
                    stringbuilder.append('\n');
                    k1++;
                }
                stringbuilder.append("\n\n");
            } while (cursor.moveToNext());
        }
    }

    public static boolean a(DebugActivity debugactivity, String s)
    {
        ((ClipboardManager)debugactivity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", s));
        Toast.makeText(debugactivity, "Copied to clipboard", 0).show();
        return true;
    }

    public static boolean a(DebugActivity debugactivity, boolean flag)
    {
        debugactivity.k = flag;
        return flag;
    }

    public static Intent b(Context context)
    {
        return c(context);
    }

    public static android.widget.AdapterView.OnItemClickListener b(DebugActivity debugactivity, Cursor cursor)
    {
        return new ckx(debugactivity, cursor);
    }

    private ArrayAdapter b()
    {
        return new clk(this, this, g.gE, h.gT);
    }

    public static ani b(DebugActivity debugactivity)
    {
        return debugactivity.j;
    }

    private static String b(String s, Object obj)
    {
        if (obj == null)
        {
            return "NULL";
        }
        if ((obj instanceof ctr) || (obj instanceof cvn))
        {
            return obj.getClass().getSimpleName();
        }
        obj = obj.toString();
        s = s.toLowerCase(Locale.US);
        if (s.contains("timestamp") || s.contains("watermark"))
        {
            Object obj1;
            try
            {
                long l1 = Long.parseLong(((String) (obj))) / 1000L;
                obj1 = new Time();
                ((Time) (obj1)).set(l1);
                obj1 = ((Time) (obj1)).format("%c");
            }
            catch (Exception exception)
            {
                ebw.c("Babel", String.valueOf(s).concat(" is not a Long"));
                return ((String) (obj));
            }
            return ((String) (obj1));
        }
        if (!"sms_type".equals(s)) goto _L2; else goto _L1
_L1:
        s = null;
        Integer.parseInt(((String) (obj)));
        JVM INSTR tableswitch -1 2: default 160
    //                   -1 208
    //                   0 215
    //                   1 222
    //                   2 229;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        return (new StringBuilder(String.valueOf(obj).length() + 3 + String.valueOf(s).length())).append(((String) (obj))).append(" (").append(s).append(")").toString();
_L4:
        s = "UNKNOWN";
        continue; /* Loop/switch isn't completed */
_L5:
        s = "SMS";
        continue; /* Loop/switch isn't completed */
_L6:
        s = "MMS";
        continue; /* Loop/switch isn't completed */
_L7:
        s = "MMS Notif Ind";
        if (true) goto _L3; else goto _L2
_L2:
        return ((String) (obj));
    }

    private static Intent c(Context context)
    {
        return new Intent(context, com/google/android/apps/hangouts/phone/DebugActivity$RecordingService);
    }

    public static BaseAdapter c(DebugActivity debugactivity, Cursor cursor)
    {
        return debugactivity.a(cursor);
    }

    public static ListView c(DebugActivity debugactivity)
    {
        return debugactivity.e;
    }

    public static ListView d(DebugActivity debugactivity)
    {
        return debugactivity.g;
    }

    public static aoe e(DebugActivity debugactivity)
    {
        return debugactivity.f;
    }

    public static android.widget.AdapterView.OnItemClickListener f(DebugActivity debugactivity)
    {
        return new clc(debugactivity);
    }

    public static android.widget.AdapterView.OnItemLongClickListener g(DebugActivity debugactivity)
    {
        return new cld(debugactivity);
    }

    public static ArrayAdapter h(DebugActivity debugactivity)
    {
        return debugactivity.b();
    }

    public static ArrayAdapter i(DebugActivity debugactivity)
    {
        return debugactivity.i;
    }

    public static RecordingService j(DebugActivity debugactivity)
    {
        return debugactivity.h;
    }

    public static android.widget.AdapterView.OnItemClickListener k(DebugActivity debugactivity)
    {
        return new ckz(debugactivity);
    }

    public static android.widget.AdapterView.OnItemLongClickListener l(DebugActivity debugactivity)
    {
        return new cla(debugactivity);
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        Object obj;
        obj = (android.widget.AdapterView.AdapterContextMenuInfo)menuitem.getMenuInfo();
        obj = (Cursor)e.getAdapter().getItem(((android.widget.AdapterView.AdapterContextMenuInfo) (obj)).position);
        obj = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("conversation_id"));
        menuitem.getItemId();
        JVM INSTR tableswitch 1 3: default 76
    //                   1 85
    //                   2 119
    //                   3 153;
           goto _L1 _L2 _L3 _L4
_L1:
        e.invalidateViews();
        return true;
_L2:
        i = b();
        h.a(i, ((String) (obj)));
        g.setAdapter(i);
        continue; /* Loop/switch isn't completed */
_L3:
        i = b();
        h.a(i, null);
        g.setAdapter(i);
        continue; /* Loop/switch isn't completed */
_L4:
        f.j(((String) (obj)));
        a();
        if (true) goto _L1; else goto _L5
_L5:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.fE);
        j = dbf.e(c.a());
        d = (TextView)findViewById(h.aJ);
        e = (ListView)findViewById(0x102000a);
        l = (gms)a.a(gms);
        l.b(j.h()).c("preserve_response_data", true).d();
        (new cko(this)).a(new Void[0]);
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        if (view.equals(e))
        {
            contextmenu.add(0, 1, 0, "FOCUS");
            contextmenu.add(0, 2, 0, "CLEAR FOCUS");
            contextmenu.add(0, 3, 0, "REMOVE CONVERSATION");
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.add(0, 1, 0, "Clear History");
        return true;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        l.b(j.h()).c("preserve_response_data", k).d();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 1: // '\001'
            i.clear();
            break;
        }
        RecordingService.a(h).clear();
        i.notifyDataSetChanged();
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        return true;
    }

    public void onResume()
    {
        super.onResume();
        String s = getIntent().getStringExtra("conversation_id");
        if (s != null)
        {
            getIntent().removeExtra("conversation_id");
            (new Handler()).postDelayed(new cli(this, s), 100L);
        }
    }

    public void onStart()
    {
        super.onStart();
        Intent intent = new Intent(this, com/google/android/apps/hangouts/phone/DebugActivity$RecordingService);
        if (m == null)
        {
            m = new cll(this);
        }
        bindService(intent, m, 1);
    }

    public void onStop()
    {
        super.onStop();
        if (m != null)
        {
            unbindService(m);
            m = null;
        }
        if (!((CheckBox)findViewById(h.at)).isChecked())
        {
            stopService(c(this));
        }
    }


    private class RecordingService extends Service
    {

        private static final SimpleDateFormat e = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
        private final Handler a = new Handler();
        private final IBinder b = new clp(this);
        private ArrayAdapter c;
        private final ArrayList d = new ArrayList();
        private String f;

        public static SimpleDateFormat a()
        {
            return e;
        }

        public static ArrayList a(RecordingService recordingservice)
        {
            return recordingservice.d;
        }

        public static String b(RecordingService recordingservice)
        {
            return recordingservice.f;
        }

        public static ArrayAdapter c(RecordingService recordingservice)
        {
            return recordingservice.c;
        }

        public static Handler d(RecordingService recordingservice)
        {
            return recordingservice.a;
        }

        public void a(ArrayAdapter arrayadapter, String s)
        {
            c = arrayadapter;
            f = s;
            c.clear();
            arrayadapter = d.iterator();
            do
            {
                if (!arrayadapter.hasNext())
                {
                    break;
                }
                s = (Intent)arrayadapter.next();
                if (f == null || TextUtils.equals(s.getStringExtra("conversation_id"), f))
                {
                    c.add(s);
                }
            } while (true);
            c.notifyDataSetChanged();
        }

        public IBinder onBind(Intent intent)
        {
            return b;
        }

        public void onCreate()
        {
            RealTimeChatService.a(new cln(this));
        }

        public void onDestroy()
        {
        }

        public void onStart(Intent intent, int i1)
        {
        }

        public int onStartCommand(Intent intent, int i1, int j1)
        {
            return 1;
        }


        public RecordingService()
        {
        }
    }

}
