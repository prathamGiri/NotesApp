package com.example.notes.feature_note.domain.use_case

data class NoteUseCases(
    val getNotes: GetNoteUseCase,
    val deleteNote: DeleteNoteUseCase,
    val addNote: AddNoteUseCase,
    val getNoteById: GetNoteByIdUseCase
)
