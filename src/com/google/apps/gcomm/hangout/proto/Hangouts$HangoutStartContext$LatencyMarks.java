// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.apps.gcomm.hangout.proto;

import kog;
import koh;
import koj;
import kon;
import kop;

public final class clear extends koj
{

    private static volatile serverCreateRedirectEnd _emptyArray[];
    public Long clientLaunch;
    public Long serverCreateRedirectEnd;
    public Long serverCreateRoomEnd;
    public Long serverCreateRoomStart;

    public static clear[] emptyArray()
    {
        if (_emptyArray == null)
        {
            synchronized (kon.a)
            {
                if (_emptyArray == null)
                {
                    _emptyArray = new _emptyArray[0];
                }
            }
        }
        return _emptyArray;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static _emptyArray parseFrom(kog kog1)
    {
        return (new <init>()).mergeFrom(kog1);
    }

    public static mergeFrom parseFrom(byte abyte0[])
    {
        return (mergeFrom)kop.mergeFrom(new <init>(), abyte0);
    }

    public <init> clear()
    {
        clientLaunch = null;
        serverCreateRoomStart = null;
        serverCreateRoomEnd = null;
        serverCreateRedirectEnd = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (clientLaunch != null)
        {
            i = j + koh.e(1, clientLaunch.longValue());
        }
        j = i;
        if (serverCreateRoomStart != null)
        {
            j = i + koh.e(2, serverCreateRoomStart.longValue());
        }
        i = j;
        if (serverCreateRoomEnd != null)
        {
            i = j + koh.e(3, serverCreateRoomEnd.longValue());
        }
        j = i;
        if (serverCreateRedirectEnd != null)
        {
            j = i + koh.e(4, serverCreateRedirectEnd.longValue());
        }
        return j;
    }

    public serverCreateRedirectEnd mergeFrom(kog kog1)
    {
        do
        {
            int i = kog1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(kog1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                clientLaunch = Long.valueOf(kog1.e());
                break;

            case 16: // '\020'
                serverCreateRoomStart = Long.valueOf(kog1.e());
                break;

            case 24: // '\030'
                serverCreateRoomEnd = Long.valueOf(kog1.e());
                break;

            case 32: // ' '
                serverCreateRedirectEnd = Long.valueOf(kog1.e());
                break;
            }
        } while (true);
    }

    public volatile kop mergeFrom(kog kog1)
    {
        return mergeFrom(kog1);
    }

    public void writeTo(koh koh1)
    {
        if (clientLaunch != null)
        {
            koh1.b(1, clientLaunch.longValue());
        }
        if (serverCreateRoomStart != null)
        {
            koh1.b(2, serverCreateRoomStart.longValue());
        }
        if (serverCreateRoomEnd != null)
        {
            koh1.b(3, serverCreateRoomEnd.longValue());
        }
        if (serverCreateRedirectEnd != null)
        {
            koh1.b(4, serverCreateRedirectEnd.longValue());
        }
        super.writeTo(koh1);
    }

    public ()
    {
        clear();
    }
}
