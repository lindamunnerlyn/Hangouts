// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.NfcEvent;
import android.os.Bundle;
import android.os.Handler;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public final class brb extends ad
    implements android.nfc.NfcAdapter.CreateNdefMessageCallback
{

    private NfcAdapter a;
    private Handler b;
    private bph c;

    public brb()
    {
    }

    static void a(brb brb1)
    {
        obj = bnk.a().s();
        if (obj != null) goto _L2; else goto _L1
_L1:
        g.l("HangoutState is null. Will not send NdefMessage");
_L4:
        synchronized (brb1.b)
        {
            brb1.b.notify();
        }
        return;
_L2:
        Object obj1 = ((bpm) (obj)).q();
        if (obj1 != null)
        {
            obj1 = ((geu) (obj1)).n();
            if (obj1 != null)
            {
                brb1.c = ((bpm) (obj)).e().b(((gku) (obj1)).a());
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        brb1;
        obj;
        JVM INSTR monitorexit ;
        throw brb1;
    }

    public NdefMessage createNdefMessage(NfcEvent nfcevent)
    {
        g.l("createNdefMessage");
        nfcevent = b;
        nfcevent;
        JVM INSTR monitorenter ;
        b.post(new brc(this));
        b.wait();
        if (c == null)
        {
            g.l("Could not fetch HangoutRequest. Will not send NdefMessage.");
            return null;
        }
        break MISSING_BLOCK_LABEL_66;
        Object obj;
        obj;
        g.l("InterruptedException while creating NdefMessage.");
        nfcevent;
        JVM INSTR monitorexit ;
        return null;
        obj;
        nfcevent;
        JVM INSTR monitorexit ;
        throw obj;
        try
        {
            nfcevent = c;
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            (new ObjectOutputStream(bytearrayoutputstream)).writeObject(nfcevent);
            nfcevent = bytearrayoutputstream.toByteArray();
        }
        // Misplaced declaration of an exception variable
        catch (NfcEvent nfcevent)
        {
            nfcevent = String.valueOf(nfcevent);
            g.l((new StringBuilder(String.valueOf(nfcevent).length() + 34)).append("Cannot serialize hangout request: ").append(nfcevent).toString());
            return null;
        }
        return new NdefMessage(new NdefRecord[] {
            NdefRecord.createExternal("com.google.android.apps.hangouts", "hangoutrequest", nfcevent)
        });
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (eev.a("Babel_calls", 2))
        {
            eev.b("Babel_calls", "onCreate NfcHangoutFragment");
        }
        b = new Handler();
    }

    public void onResume()
    {
        super.onResume();
        a = NfcAdapter.getDefaultAdapter(getActivity());
        if (a == null)
        {
            return;
        } else
        {
            a.setNdefPushMessageCallback(this, getActivity(), new Activity[0]);
            return;
        }
    }
}
